import { v4 as uuid} from 'uuid'

class Car {
    id?: string
    name: string
    model: string
    price: number
    brand: string

    constructor(  ){
        if(!this.id){
            this.id = uuid()
        }
    }

}

export{ Car }