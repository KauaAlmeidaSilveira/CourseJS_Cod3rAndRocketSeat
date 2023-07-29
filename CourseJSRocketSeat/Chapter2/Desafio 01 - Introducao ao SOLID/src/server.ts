import express from "express";

import swaggerUi from 'swagger-ui-express'
import  swaggerFile  from './swagger.json'

import { userRouter } from "./routes/user.routes";

const app = express()

app.use(express.json())

app.use("/api-docs", swaggerUi.serve, swaggerUi.setup(swaggerFile))

app.use('/users', userRouter)

app.listen(3333, () => console.log('Executando na porta 3333....'))

