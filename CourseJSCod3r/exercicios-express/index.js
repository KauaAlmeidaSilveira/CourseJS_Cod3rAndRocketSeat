const express = require('express')
const app = express()
const bodyParser = require('body-parser')

const saudacao = require('./saudacaoMid')
const usuarioApi = require('./api/usuario')
require('./api/produto')(app, ' com param!')


app.post('/usuario', usuarioApi.salvar)
app.get('/usuario', usuarioApi.obter)

app.use(bodyParser.text())
app.use(bodyParser.json())
app.use(bodyParser.urlencoded({extended: true}))

app.use(saudacao('Guilherme'))

app.use('/opa', (req, res, next) => {
    console.log('Antes')
    next()
})

app.get('/clientes/relatorio', (req, res) => {
    res.send(`Cliente relatório: completo = ${req.query.completo}, ano = ${req.query.ano}`)
})

app.post('/corpo', (req, res) => {
    // let corpo= ''
    // req.on('data', function(parte){
    //     corpo+= parte
    // })
    // req.on('end', function(){
    //     res.json(JSON.parse(corpo))
    // })
    res.send(req.body)
})

app.get('/clientes/:id', (req, res) => {
    res.send(`Cliente ${req.params.id} selecionado!`)
})

app.get('/opa', (req, res, next) => {
    // res.send('<h1>Estou bem</h1><br><br><h2>Tipo é HTML!</h2>')

    // res.json({
    //     name: 'Ipad 32Gb',
    //     price: 1.899,
    //     discount: 0.10
    // })
    console.log('Durante')
    res.json({
        data: [
            {id: 7, name: 'Ana', position: 1},
            {id: 34, name: 'Bia', position: 2},
            {id: 73, name: 'Carlos', position: 3}
        ],
        count: 30,
        skip: 0,
        limit: 3,
        status: 200
    })
    next()
})

app.use('/opa', (req, res, next) => {
    console.log('Depois')
    next()
})



app.listen(3000, () => {
    console.log("BackEnd executando...")
})

