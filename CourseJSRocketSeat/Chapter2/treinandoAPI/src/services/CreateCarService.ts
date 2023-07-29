import { CarRepository } from "../repositories/CarRepository";

interface IRequest {
    name: string
    model: string
    price: number
    brand: string
}

class CreateCarService {

    constructor(private carRepository: CarRepository){}

    execute({name, model, price, brand}: IRequest): void{

        const carAlreadyExists = this.carRepository.findByName(name)

        if(carAlreadyExists){
            throw new Error('Car already exists!')
        }

        this.carRepository.create({name, model,price, brand})

    }

}

export { CreateCarService }