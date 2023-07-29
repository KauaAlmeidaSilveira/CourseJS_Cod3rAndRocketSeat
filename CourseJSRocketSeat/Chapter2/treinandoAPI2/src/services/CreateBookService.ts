import { BookRepository } from '../repositories/BookRepository'

interface IRequest {
    name: string
    qntPag: number
    author: string
    genre: string
}

class CreateBookService {

    constructor(private bookRepository: BookRepository){}

    execute({name, qntPag, author, genre}: IRequest): void{

        const bookAlreadyExists = this.bookRepository.findByName(name)

        if(bookAlreadyExists){
            throw new Error('Book Already Exists!!!')
        }

        this.bookRepository.create({name, qntPag, author, genre})
    }

    list(){
        return this.bookRepository.list()
    }

}

export{ CreateBookService }