import { Router } from 'express'
import { BookRepository } from '../repositories/BookRepository'
import { CreateBookService } from '../services/CreateBookService'


const bookRoutes = Router()
const bookRepository = new BookRepository()
const bookService = new CreateBookService(bookRepository)

bookRoutes.post('/', (req, res) => {
    const {name, qntPag, author, genre} = req.body

    bookService.execute({name, qntPag, author, genre})

    return res.json({
        msg: 'Book inserted successfully !!'
    })
})

bookRoutes.get('/', (req, res) => {
    return res.json(bookService.list())
})

export { bookRoutes }