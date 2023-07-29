import { Router } from "express";
import multer from "multer";

import { createSpecificationController } from "../modules/cars/useCases/createSpecification";
import { listSpecificationController } from "../modules/cars/useCases/listSpecification";
import { importSpecificationController } from "../modules/cars/useCases/importSpecification";

const specificationRouter = Router()

const upload = multer({
    dest: './tmp'
})

specificationRouter.post('/', (req, res) => {
    return createSpecificationController.handle(req, res)
})

specificationRouter.get('/', (req, res) => {
    return listSpecificationController.handle(req, res)
})

specificationRouter.post('/import', upload.single('file'), (req, res) => {
    return importSpecificationController.handle(req, res)
})

export { specificationRouter }