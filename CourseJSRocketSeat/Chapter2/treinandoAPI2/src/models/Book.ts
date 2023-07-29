import {v4 as uuid} from 'uuid'

class Book {
    id?: string
    name: string
    qntPag: number
    author: string
    genre: string

    constructor(){
        if(!this.id){
            this.id = uuid()
        }
    }

}

export { Book }
