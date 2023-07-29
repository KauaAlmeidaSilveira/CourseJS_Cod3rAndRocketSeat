import { Request, Response } from 'express'
import { ListCategoryUseCase } from "./ListCategoryUseCase";

class ListCategoryController{

    constructor(private listCategoryUseCase: ListCategoryUseCase){}

    handle(req: Request, res: Response): Response{
        return res.json(this.listCategoryUseCase.execute())
    }

}

export{ ListCategoryController }