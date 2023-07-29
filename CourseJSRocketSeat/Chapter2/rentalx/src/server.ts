import express from 'express'
import { categoryRoute } from './routes/categories.routes'
import { specificationRouter } from './routes/specifications.routes'

const app = express()

app.use(express.json())

app.use('/category', categoryRoute)

app.use('/specification', specificationRouter)

app.listen(3333, () => console.log('Executando porta 3333....'))