import { Book } from '../models/Book'

interface ICreateBookDTO {
    name: string
    qntPag: number
    author: string
    genre: string
}

class BookRepository {

    private books: Book[]

    constructor(){
        this.books = []
    }

    create({name, qntPag, author, genre}: ICreateBookDTO): void{
        const book = new Book()

        Object.assign(book, {
            name,
            qntPag,
            author,
            genre
        }) 

        this.books.push(book)

    }

    list(){
        return this.books
    }

    findByName(name){
        const book = this.books.find(book => book.name === name)
        return book
    }

}

export { BookRepository }