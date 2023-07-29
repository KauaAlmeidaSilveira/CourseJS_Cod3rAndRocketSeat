import { Router } from "express";

import { createCategoryController } from "../modules/cars/useCases/createCategory";
import { listCategoryController } from "../modules/cars/useCases/listCategory";

const categoryRouter = Router()

categoryRouter.post('/', (req, res) => {
    return createCategoryController.handle(req, res)
})

categoryRouter.get('/', (req, res) => {
    return listCategoryController.handle(req, res)
})

export { categoryRouter }