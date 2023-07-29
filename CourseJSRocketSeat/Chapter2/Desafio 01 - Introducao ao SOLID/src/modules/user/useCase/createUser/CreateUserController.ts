import { Request, Response } from "express";

import { CreateUserUseCase } from "./CreateUserUseCase";

class CreateUserController{
    constructor(private createUserUseCase: CreateUserUseCase){}

    handle(req: Request, res: Response): Response{
        const {name, email} = req.body

        this.createUserUseCase.execute({name, email})

        return res.json({
            msg: "User created successfully!!"
        })
    }

}

export { CreateUserController }