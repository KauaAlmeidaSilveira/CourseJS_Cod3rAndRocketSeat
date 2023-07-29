import { Specification } from "../model/Specification";
import { ISpecificationRepository } from "./ISpecificationRepository";


class SpecificationRepository implements ISpecificationRepository{

    private specifications: Specification[]

    private static INSTANCE: SpecificationRepository

    private constructor(){
        this.specifications = []
    }

    public static getInstance(){
        if(!SpecificationRepository.INSTANCE){
            SpecificationRepository.INSTANCE = new SpecificationRepository()
        }

        return SpecificationRepository.INSTANCE
    }

    create({name, description}): void{
        const specification = new Specification()

        Object.assign(specification, {
            name,
            description
        })

        this.specifications.push(specification)
    }

    findByName(name: string){
        const specification = this.specifications.find(specifications => specifications.name === name)
        return specification
    }

    list(){
        return this.specifications
    }
}

export { SpecificationRepository }