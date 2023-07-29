// Config inicial
require('dotenv').config() // Forma de ocultar variaveis, colocando .env no gitignore
const express = require('express')
const mongoose = require('mongoose')
const app = express()


// Forma de ler JSON / middlewares
app.use(express.urlencoded({extended: true}))
app.use(express.json())

// rotas da API
const personRoutes = require('./routes/personRoutes')
app.use('/person', personRoutes)

// Rota inicial / endpoint
app.get('/', (req, res) => {
    res.json({
        message: 'Oi Express!'
    })
})

// Entregar uma rota - CONEXÃO DO BANCO DE DADOS
const DB_USER = process.env.DB_USER
const DB_PASS = encodeURIComponent(process.env.DB_PASS)

mongoose.connect(`mongodb+srv://${DB_USER}:${DB_PASS}@apirestpayever.xw222qt.mongodb.net/?retryWrites=true&w=majority`)
    .then(() => {
        console.log('Conectamos ao MongoDB')
        app.listen(3000, () => console.log('Server running on port 3000'))
    })
    .catch((err) => console.log(err))


    
