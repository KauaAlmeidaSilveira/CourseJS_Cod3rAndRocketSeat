import { Router } from "express";
import { createSpecificationController } from "../modules/cars/useCases/createSpecification";
import { listSpecificationController } from "../modules/cars/useCases/listSpecification";

const specificationRouter = Router()

specificationRouter.post('/', (req, res) => {
    return createSpecificationController.handle(req, res)
})

specificationRouter.get('/', (req, res) => {
    return listSpecificationController.handle(req, res)
})

export { specificationRouter }