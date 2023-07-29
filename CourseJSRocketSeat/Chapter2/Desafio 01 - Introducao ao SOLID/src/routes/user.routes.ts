import { Router } from "express";

import { createUserController } from "../modules/user/useCase/createUser";
import { adminUserController } from "../modules/user/useCase/adminUser";
import { findUserController } from "../modules/user/useCase/findUser";
import { listUserController } from "../modules/user/useCase/listUser";

const userRouter = Router()

userRouter.post('/', (req, res) => {
    createUserController.handle(req, res)
})

userRouter.patch('/:id/admin', (req, res) => {
    adminUserController.handle(req, res)
})

userRouter.get('/:id', (req, res) => {
    findUserController.handle(req, res)
})

userRouter.get('/', (req, res) => {
    listUserController.handle(req, res)
})

export { userRouter }