import express from 'express'
import { bookRoutes } from './routes/Book.routes'
const app = express()

app.use(express.json())

app.use('/book', bookRoutes)
app.use('/books', bookRoutes)

app.listen(3333, () => console.log('Executando na porta 3333...'))