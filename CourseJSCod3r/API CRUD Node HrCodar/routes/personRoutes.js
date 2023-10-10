const router = require('express').Router()
const Person = require('../models/Person')


// Create - Criação de dados
router.post('/', async (req, res) => {
    // req.body
    // EX: {name: "Kauã", salary: 5000, approved: true}
    const {name, salary, approved} = req.body

    if(!name){
        res.status(422).json({
            message: 'Error: O nome é obrigatório!'
        })
        return
    }

    const person = {
        name,
        salary,
        approved
    }
    
    try {
        // criando dados
        await Person.create(person)

        res.status(201).json({
            message: 'Pessoa inserida no sistema com sucesso!!'
        })

    } catch (err) {
        res.status(500).json({err: err})
    }
})

// Read - leitura de dados
router.get('/', async (req, res) => {
    try {

        const people = await Person.find()
        res.status(200).json(people)

    } catch (err){
        res.status(500).json({err: err})
    }
})

router.get('/:id', async (req, res) => {
    // const id = {_id: (req.params.id).toString()}
    const id = req.params.id
    try {
        const person = await Person.findById({_id: id})

        if(!person){
            res.status(422).json({
                message: 'Error: Registro não encontrado!!'
            })
            return
        }

        res.status(200).json(person)

    } catch (err){
        res.status(500).json({err: err})
    }
})

// Update - Atualização de dados (PUT, PATCH)

/* 
    Obs o PUT espera todos os dados do obj para realizar a alteração !!
    Diferente do PATH, que significa atualização parcial  
*/

router.patch('/:id', async (req, res) => {
    const id = req.params.id

    const {name, salary, approved} = req.body

    if(!name){
        res.status(422).json({
            message: 'Error: O nome é obrigatório!'
        })
        return
    }

    const person = {
        name,
        salary,
        approved
    }

    try{

        const updatedPerson = await Person.updateOne({_id: id}, person)

        if(updatedPerson.matchedCount === 0){
            res.status(422).json({
                message: 'Error: Usuario não encontrado!!'
            })
            return
        }

        res.status(200).json(person)
        
    } catch (err){
        res.status(500).json({err: err})
    }

})

// Delete - Deletar dados
router.delete('/:id', async (req, res) => {

    const id = req.params.id

    const person = await Person.findById({_id: id})

    if(!person){
        res.status(422).json({
            message: 'Error: Registro não encontrado!!'
        })
        return
    }

    try {

        await Person.deleteOne({_id: id})
        res.status(200).json({
            message: 'Usuario deletado com sucesso!!'
        })

    } catch (err){
        res.status(500).json({err: err})
    }

})


module.exports = router