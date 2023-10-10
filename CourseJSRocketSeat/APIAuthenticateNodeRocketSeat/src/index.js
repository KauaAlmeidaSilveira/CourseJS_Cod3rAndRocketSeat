require('dotenv').config() // Forma de ocultar variaveis, colocando .env no gitignore
const express = require('express')
const bodyParser = require('body-parser')
const mongoose = require('mongoose')

const app = express()

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({extended: false}))

require('./app/controllers/index')(app)

// Entregar uma rota - CONEXÃO DO BANCO DE DADOS
const DB_USER = process.env.DB_USER
const DB_PASSWORD = encodeURIComponent(process.env.DB_PASSWORD)

mongoose.connect(`mongodb+srv://${DB_USER}:${DB_PASSWORD}@apirockectseatnode.dcvwczd.mongodb.net/?retryWrites=true&w=majority`)
    .then(() => {
        console.log('Conectamos ao MongoDB')
        app.listen(3000)
    })
    .catch((err) => console.log(err))



