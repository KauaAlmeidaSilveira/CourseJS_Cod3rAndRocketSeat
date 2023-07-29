import express from 'express'
import { carRoutes } from './routes/Car.routes'

const app = express()

app.use(express.json())

app.use("/car", carRoutes)
app.use("/cars", carRoutes)


app.listen(3333, () => console.log('Executando na porta 3333!'))