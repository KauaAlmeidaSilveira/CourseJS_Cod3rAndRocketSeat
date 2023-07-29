import { ISpecificationRepository } from "../../repositories/ISpecificationRepository";
import csvParse from 'csv-parse'
import fs from 'fs'

class ImportSpecificationUseCase{

    constructor(private specificationRepository: ISpecificationRepository){}

    execute(file: Express.Multer.File): void{
        
        const stream = fs.createReadStream(file.path)

        const parseFile = csvParse.parse()

        stream.pipe(parseFile)

        parseFile.on("data", async (line) => {
            const [name, description] = line

            this.specificationRepository.create({name, description})
        })
        
    }

}

export { ImportSpecificationUseCase }