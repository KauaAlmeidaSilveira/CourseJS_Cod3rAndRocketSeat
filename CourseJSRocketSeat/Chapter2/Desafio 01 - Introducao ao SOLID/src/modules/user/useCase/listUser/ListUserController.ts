import {Request, Response} from 'express'

import { ListUserUseCase } from "./ListUserUseCase";

class ListUserController{

    constructor(private listUserUseCase: ListUserUseCase){}

    handle(req: Request, res: Response){

        const users = this.listUserUseCase.execute(req.headers['id'] as string)

        return res.json(users)

    }
}

export { ListUserController }