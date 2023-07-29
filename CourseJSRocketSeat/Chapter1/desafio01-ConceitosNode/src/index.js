const express = require('express')
const {v4: uuid} = require('uuid')

const app = express()
app.use(express.json())

const users = []

//Middlewares
const userExist = (req, res, next) => {
    const {username} = req.headers

    const user = users.find(user => user.username === username)
    
    if(!user){
        return res.status(400).json({error: "User don't exists !"})
    }else{
        req.user = user
        next()
    }
}

const todoExist = (req, res, next) => {
    const {username} = req.headers
    const {id} = req.headers

    const user = users.find(user => user.username === username)
    
    if(!user){
        return res.status(400).json({error: "User don't exists !"})
    }

    const toDo = user.todos.find(todo => todo.id === id)

    if(toDo){
        req.todo = toDo
        req.user = user
        next()
    }else{
        return res.status(400).json({error: "To do not found !!"})
    }

}

const checksCreateTodosUserAvailability = (req, res, next) => {
    const user = req.user

    if(user.todos.length >= 10 && user.plan === false){
        return res.status(400).json({error: "Can't create one more toDO, because you don't have a pro plan"})
    }else{
        req.user = user
        next()
    }
    
}

//User
app.post("/user", (req, res) => {
    const {name, username, plan} = req.body

    // Validando se o User existe
    const userAlreadyExist = users.find(user => user.username === username)
    
    if(userAlreadyExist){
        return res.status(400).json({error: "User already Exist"})
    } else {
        const newUser = {
            id: uuid(),
            name,
            username,
            todos: [],
            plan
        }
        users.push(newUser)

        return res.status(201).json(newUser)
    }
})

app.put("/user/plan", userExist, (req, res) => {
    const user = req.user
    const newPlan = req.body

    user.plan = newPlan.plan
    res.status(200).json(user)
    
})

app.get("/user", userExist, (req, res) => {
    const user = req.user
    res.json(user)
})

app.get("/users", (req, res) => {
    return res.status(200).json(users)
})

//To do
app.post("/todo", userExist, checksCreateTodosUserAvailability, (req, res) => {
    const {title} = req.body
    const user = req.user

    user.todos.push({
        id: uuid(),
        title,
        done: false,
        created_at: new Date()
    })

    res.status(200).json({
        msg: "To do inserida!!",
        user
    })
})

app.get("/todos", userExist, (req, res) => {
    const user = req.user

    res.status(200).json(user.todos)
})

app.put("/todos", todoExist, (req, res) => {
    const newTitle = req.body
    const toDo = req.todo

    if(toDo){
        toDo.title = newTitle.title
        res.status(200).json(toDo)
    }
})

app.patch("/todos/done", todoExist, (req, res) => {
    const toDo = req.todo

    if(toDo){
        toDo.done = true
        res.status(200).json(toDo)
    }

})

app.delete("/todos", todoExist,(req, res) => {
    const user = req.user
    const todo = req.todo

    if(todo){
        user.todos.splice(todo.id, 1)
        res.status(200).json({msg: "To do deleted !!"})
    }
})

app.listen('3333', () => console.log('Executando na porta 3333....'))