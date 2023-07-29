import {Request, Response} from 'express'

import { FindUserUseCase } from "./FindUserUseCase";

class FindUserController{

    constructor(private findUserUseCase: FindUserUseCase){}

    handle(req: Request, res: Response): Response{

        const user = this.findUserUseCase.execute(req.params.id)

        return res.json(user)
    }

}

export { FindUserController }