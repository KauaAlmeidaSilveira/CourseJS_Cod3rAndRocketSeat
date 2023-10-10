const User = require('../models/User')

exports.create = async (req, res) => {
    try{

        const {name, password, avatar} = req.body

        const file = req.file

        if(!file){
            res.status(422).json({
                message: 'Error: A img é obrigatória!'
            })
            return
        }

        if(!name){
            res.status(422).json({
                message: 'Error: O nome é obrigatório!'
            })
            return
        }
        if(!password){
            res.status(422).json({
                message: 'Error: A senha é obrigatória!'
            })
            return
        }

        const userExist = await User.findOne({name})

        if(userExist){
            return res.status(500).json({
                Error: 'Usuario already exist'
            })
        }

        const user = new User({
            name,
            password,
            avatar: file.path
        })

        await user.save()

        res.json({user, msg: 'User inserido com sucesso'})

    } catch (err) {
        res.status(500).json({err: 'Error ao salvar o user'})
    }
}

exports.select = async (req, res) => {

    const id  = req.params.id
    
    try {
        const user = await User.findById({_id: id})

        if(!user){
            return res.status(500).json({
                Error: 'User not found'
            })
        }
    
        res.status(200).json(user)

    } catch (err){
        res.status(500).json({err: err})
    }
}

exports.delete = async (req, res) => {

    const id  = req.params.id

    const user = await User.findById({_id: id})

    if(!user){
        return res.status(500).json({
            Error: 'User not found'
        })
    }

    try {
        
        await User.deleteOne({_id: id})
        res.status(200).json({
            msg: 'User delete successfully',
            data: user
        })

    } catch (err){
        res.status(500).json({err: err})
    }

}