const pessoas = [{
    nome: "Kaua",
    todos: []
}, {
    nome: "Joao",
    todos: []
}]

const pessoa = pessoas.find((pessoa) => pessoa.nome === 'kaua')

pessoas.splice(pessoa, 1)

console.log(pessoas)