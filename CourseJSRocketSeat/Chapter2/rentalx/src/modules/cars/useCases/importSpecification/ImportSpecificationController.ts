import {Request, Response} from 'express'

import { ImportSpecificationUseCase } from './ImportSpecificationUseCase'

class ImportSpecificationController{

    constructor(private importSpecificationUseCase: ImportSpecificationUseCase){}

    handle(req: Request, res: Response){
        const {file} = req

        this.importSpecificationUseCase.execute(file as Express.Multer.File)

        res.send()
    }

}

export { ImportSpecificationController }