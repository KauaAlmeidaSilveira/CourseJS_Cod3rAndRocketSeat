import { Router } from "express";
import { CarRepository } from "../repositories/CarRepository";
import { CreateCarService } from "../services/CreateCarService";

const carRoutes = Router()
const carRepository = new CarRepository()

carRoutes.post("/", (req, res) => {
    const { name, model, price, brand } = req.body

    const carService = new CreateCarService(carRepository)

    carService.execute({name, model, price, brand})

    return res.status(201).json({
        msg: 'Car inserted successfully !!'
    })
})

carRoutes.get("/", (req, res) => {
    const list = carRepository.listCars()
    return res.status(201).json(list)
})

export { carRoutes }