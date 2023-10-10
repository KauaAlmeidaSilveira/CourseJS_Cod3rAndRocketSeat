require('dotenv').config()
const express = require('express')
const mongoose = require('mongoose')
// const router = require('./routers/router')
const app = express()

const userRouter = require('./routers/userRouter')

// Forma de ler JSON / middlewares
app.use(express.urlencoded({extended: true}))
app.use(express.json())

// app.use(router)
app.use(userRouter)

mongoose.connect(`mongodb+srv://kauaAlmeida:vsc3kZzudVMph7z4@apirestpayever.xw222qt.mongodb.net/?retryWrites=true&w=majority`)
    .then(() => {
        app.listen(3000, () => console.log('Server running on port 3000'))
    })
    .catch((err) => console.log(err))

