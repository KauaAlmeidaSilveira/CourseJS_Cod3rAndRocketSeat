import {Request, Response} from 'express'

import { AdminUserUseCase } from "./AdminUserUseCase";

class AdminUserController{

    constructor(private adminUserUseCase: AdminUserUseCase){}

    handle(req: Request, res: Response): Response{

        const id = req.params.id
        
        this.adminUserUseCase.execute(id)

        return res.status(401).json({
            msg: 'User alter successfully!'
        })

    }

}

export { AdminUserController }