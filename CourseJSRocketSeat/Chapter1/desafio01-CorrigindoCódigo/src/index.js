const express = require('express')
const {v4: uuid} = require('uuid')

const app = express()

const repositories = []

const verifyRepositoryExist = (req, res, next) => {
    const idRepository = req.params.id

    const repository = repositories.find(repository => repository.id === idRepository)

    if(repository){
        req.repository = repository
        next()
    }else{
        return res.status(404).json({error: "Repository don't exists !!"})
    }
}

app.use(express.json())

app.post("/repository", (req, res) => {
    const {title, url, techs} = req.body

    const repository = {
        id: uuid(),
        title,
        url,
        techs,
        likes: 0
    }

    repositories.push(repository)

    return res.status(201).json(repository)
    
})

app.get("/repositories", (req, res) => {
    res.status(200).json(repositories)
})

app.put("/repositories/:id", verifyRepositoryExist, (req, res) => {
    const repository = req.repository

    const {title, url, techs} = req.body
   
    repository.title = title
    repository.url = url
    repository.techs = techs

    return res.status(201).json({msg: "Update completed successfully !!"})
   
})

app.delete("/repositories/:id", verifyRepositoryExist, (req, res) => {
    const repository = req.repository

    repositories.splice(repositories.indexOf(repository), 1)

    return res.status(204).json({msg: "Repository deleted succesfully !!"})
})

app.post("/repositories/:id/like", verifyRepositoryExist, (req, res) => {
    const repository = req.repository 

    repository.likes++
    return res.status(200).json({msg: "Like !!"})

})


app.listen(3333, () => console.log('Executando...Porta 3333'))