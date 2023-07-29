import { ICategoriesRepository } from "../../repositories/ICategoriesRepository";
import csvParse from 'csv-parse'

import fs from 'fs'; //filesystem

class ImportCategoryUseCase {

    constructor(private categoriesRepository: ICategoriesRepository){}

    execute(file: Express.Multer.File): void{
        const stream = fs.createReadStream(file.path) // esse metodo le o arquivo aos poucos

        const parseFile = csvParse.parse()

        stream.pipe(parseFile) // armazena o arquivo lido

        parseFile.on("data",async (line) => {
            const [name, description] = line

            this.categoriesRepository.create({name, description})
        })
    }

}

export { ImportCategoryUseCase }