import express from 'express'
import { categoryRouter } from './routes/categories.routes'
import { specificationRouter } from './routes/specifications.routes'

const app = express()

app.use(express.json())

app.use('/category', categoryRouter)
app.use('/categories', categoryRouter)

app.use('/specification', specificationRouter)
app.use('/specifications', specificationRouter)

app.listen(3333, () => {console.log('Executando na porta 3333...')})