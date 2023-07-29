import { Car } from "../model/Car";

interface ICreateCarDTO {
    name: string
    model: string
    price: number
    brand: string
}

class CarRepository {
    private cars: Car[]

    constructor() {
        this.cars = []
    }

    create({ name, model, price, brand }: ICreateCarDTO): void {
        const car = new Car()

        Object.assign(car, {
            name,
            model,
            price,
            brand
        })
        
        this.cars.push(car)
    }

    listCars(): Car[]{
        return this.cars
    }

    findByName(name: string){
        const car = this.cars.find(car => car.name === name)
        return car
    }

}

export{ CarRepository }