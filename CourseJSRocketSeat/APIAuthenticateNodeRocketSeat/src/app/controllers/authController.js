const express = require('express')
const bcrypt = require('bcryptjs')
const jwt = require('jsonwebtoken')


const authConfig = require('../../config/auth.json')

const User = require('../models/user')

const router = express.Router()

function generateToken(params = {}){
    return jwt.sign(params, authConfig.secret, {
        expiresIn: 86400,
    })
}


// Create - Criação de dados
router.post('/register', async (req, res) => {

    const { email } = req.body

    try{

        if(await User.findOne({email})){
            return res.status(500).json({
                Error: 'User already exists'
            })
        }

        const user = await User.create(req.body)

        user.password = undefined

        return res.status(201).json({
            message: 'User insert successfully !!',
            date: user,
            token: generateToken({id: user.id})
        })

    }catch (err){
        return res.status(500).json({
            Error: 'Registration Failed'
        })
    }
})

// Autenticação - JWT
router.post('/authenticate', async (req, res) => {
    const {email, password} = req.body

    const user = await User.findOne({email}).select('+password')

    if(!user)
        return res.status(500).json({Error: 'User Not Found'})
    
    if(!await bcrypt.compare(password, user.password))
        return res.status(500).json({Error: 'Invalid password'})

    user.password = undefined

    res.send({
        user, 
        token: generateToken({id: user.id})
    })

})


module.exports = app => app.use('/auth', router)
