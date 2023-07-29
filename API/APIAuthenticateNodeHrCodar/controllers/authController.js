require('dotenv').config()
const express = require('express')
const bcrypt = require('bcrypt')
const jwt = require('jsonwebtoken')

const router = express.Router()

const User = require('../models/user')

// Open Route - Public Route
router.get('/', async (req, res) => {
    res.status(200).json({
        msg: 'Bem vindo a nossa API' 
    })
})

// Private Route
router.get('/user/:id', checkToken, async (req, res) => {
    const id = req.params.id

    const user = await User.findById(id, '-password')

    if(!user){
        res.status(404).json({msg: 'user não encontrado'})
    }

    res.status(200).json({user})
})

function checkToken(req, res, next){
    const authHeader = req.headers['authorization']
    const token = authHeader && authHeader.split(" ")[1]

    if(!token){
        return res.status(401).json({msg: 'Acesso negado'})
    }

    try{
        const SECRET = process.env.SECRET

        jwt.verify(token, SECRET)

        next()
    }catch(err){
        return res.status(400).json({msg: 'Token invalido'})
    }
    
}

//Create - Criação de dados
router.post('/register', async (req, res) => {

    const {name, email, password, confirmpassword} = req.body


    // VALIDAÇÃO
    if(!name){
        res.status(422).json({
            msg: "O nome é obrigatório"
        })
    }
    if(!email){
        res.status(422).json({
            msg: "O email é obrigatório"
        })
    }
    if(!password){
        res.status(422).json({
            msg: "A password é obrigatória"
        })
    }
    if(password != confirmpassword){
        res.status(422).json({
            msg: "As senhas não conferem"
        })       
    }

    const userExist = await User.findOne({email: email})

    if(userExist)
        return res.status(422).json({msg: 'Por favor, utilize outro e-mail!'})


    
    // HASH NA SENHA
    const salt = await bcrypt.genSalt(12)
    const passwordHash = await bcrypt.hash(password, salt)

    // CRIANDO USER
    try {

        const user = req.body

        user.password = passwordHash
        
        await User.create(user)

        res.status(201).json({
            msg: 'User insert!'
        })



    } catch(err){
        return res.status(500).json({msg: err})
    }

})

// Login User
router.post('/login', async (req, res) => {
    const {email, password} = req.body

    if(!email){
        res.status(422).json({
            msg: "O email é obrigatório"
        })
    }
    if(!password){
        res.status(422).json({
            msg: "A password é obrigatória"
        })
    }

    const user = await User.findOne({email: email})

    if(!user)
        return res.status(404).json({msg: 'Usuário não encontrado'})

    const checkPassword = await bcrypt.compare(password, user.password)

    if(!checkPassword)
        return res.status(422).json({msg: 'Senha inválida'})

    try {
        const SECRET = process.env.SECRET

        const token = jwt.sign(
            {
            id: user._id,
            },
            SECRET,
        )

        res.status(200).json({msg: 'Autenticação realizada com sucesso!!', token})

    } catch(err){
        return res.status(500).json({msg: err})
    }
})

module.exports = app => app.use('/auth', router)