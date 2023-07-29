require('dotenv').config()
const express = require('express')
const mongoose = require('mongoose')
const bcrypt = require('bcrypt')
const jwt = require('jsonwebtoken')
const bodyParser = require('body-parser')

const app = express()

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({extended: false}))

require('./controllers/authController')(app)

// Conectando com db - MongoDB (Atlas)
const DB_USER = process.env.DB_USER
const DB_PASS = process.env.DB_PASS

mongoose.connect(`mongodb+srv://${DB_USER}:${DB_PASS}@apiauthhrcodar.jheuspi.mongodb.net/?retryWrites=true&w=majority`)
    .then(() => {
        app.listen(3000)
        console.log('Conectado ao MongoDB')
    })
    .catch(err => {
        console.log(err)
    })


