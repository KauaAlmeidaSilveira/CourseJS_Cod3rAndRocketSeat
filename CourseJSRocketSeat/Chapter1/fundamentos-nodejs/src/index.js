/**
 *  GET - Buscar uma informção dentro do servidor
 *  POST - Inserir uma informação no servidor
 *  PUT - Alterar uma informação no servidor
 *  PATCH - Alterar uma informação específica
 *  DELETE - Deletar uma informação no servidor
 */

/**
 * Tipos de parâmetros
 * 
 * Route Params (Dentro da rota) => Identificar / Editar / Deletar / Buscar
 * Query Params => Paginação / Filtro
 * Body Params => Obj. passado p/ inserção/alteração de recurso (JSON)
 */

const express = require('express')
const app = express()
const { v4: uuidv4 } = require('uuid')

const customers = []

app.use(express.json())

//Middleware
function verifyIfExistsAccountCPF(req, res, next){
    const { cpf } = req.headers

    const customer = customers.find(customer => customer.cpf === cpf)

    if(!customer){
        return res.status(400).json({error: "Customer don't exists!"})
    }

    req.customer = customer

    return next()
}

// CREATE CUSTOMER
app.post("/account", (req, res) => {
    const {cpf, name} = req.body

    const customersAlreadyExists = customers.some(
        customer => customer.cpf === cpf
    )

    if(customersAlreadyExists){
        return res.status(400).json(
            {
                error: "Customer already exists!"
            }
        )
    }

    customers.push({
        cpf,
        name,
        id: uuidv4(),
        statement: [],
        balance: {total: 0}
    })

    return res.json({
        msg: 'Customer created successfully'
    })
})

app.get("/statement/", verifyIfExistsAccountCPF, (req, res) => {
    const { customer } = req;

    const statementWithBalance = [customer.statement, customer.balance]

    return res.json(statementWithBalance)
})

app.get("/statement/date", verifyIfExistsAccountCPF, (req, res) => {
    const { customer } = req;
    const { date } = req.query

    const dateFormat = new Date(date + " 00:00")

    const statement = customer.statement.filter((statement) => statement.created_at.toDateString() === new Date(dateFormat).toDateString())

    return res.json(customer.statement)
})

app.post("/deposit", verifyIfExistsAccountCPF, (req, res) => {
    const { description, amount } = req.body

    const {customer} = req

    const statementOperation = {
        description,
        amount,
        created_at: new Date(),
        type: "credit"
    }

    customer.statement.push(statementOperation)
    customer.balance.total += amount

    return res.status(201).send()
})

app.post("/withdraw", verifyIfExistsAccountCPF, (req, res) => {
    const { description, amount } = req.body

    const {customer} = req

    const statementOperation = {
        description,
        amount,
        created_at: new Date(),
        type: "debit"
    }

    customer.statement.push(statementOperation)
    customer.balance.total += amount

    return res.status(201).send()
})

// UPDATE CUSTOMER
app.put("/account", verifyIfExistsAccountCPF, (req, res) => {
    const {name} = req.body
    const {customer} = req

    customer.name = name

    return res.status(201).send()
})

// GET CUSTOMER
app.get("/account", verifyIfExistsAccountCPF, (req, res) => {
    const {customer} = req
    res.json(customer)
})

app.delete("/account", verifyIfExistsAccountCPF, (req, res) => {
    const {customer} = req

    customers.splice(customer, 1)

    res.status(200).json(customers)
})
 
app.listen(3333, () => console.log('Executando... Porta 3333')) 