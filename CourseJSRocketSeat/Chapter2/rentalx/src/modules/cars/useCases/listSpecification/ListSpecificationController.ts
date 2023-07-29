import { Request, Response } from "express";
import { ListSpecificationUseCase } from "./ListSpecificationUseCase";

class ListSpecificationController{

    constructor(private listSpecificationUseCase: ListSpecificationUseCase){}

    handle(req:Request, res:Response): Response{
        return res.json(this.listSpecificationUseCase.execute())
    }

}

export { ListSpecificationController }