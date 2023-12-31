import { Router } from "express";
import multer from "multer";

import { createCategoryController } from "../modules/cars/useCases/createCategory";
import { importCategoryController } from "../modules/cars/useCases/importCategory";
import { listCategoryController } from "../modules/cars/useCases/listCategory";

const categoryRoute = Router()

const upload = multer({
    dest: './tmp'
})

categoryRoute.post("/", (req, res)=> {
    return createCategoryController.handle(req, res)
})

categoryRoute.get("/", (req, res) => {
    return listCategoryController.handle(req, res)
})

categoryRoute.post("/import", upload.single("file"), (req, res) => {
    return importCategoryController.handle(req, res)
})

export { categoryRoute }
