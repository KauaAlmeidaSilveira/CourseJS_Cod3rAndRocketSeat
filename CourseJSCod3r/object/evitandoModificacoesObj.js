// Object.preventExtencions - Evita que você aumente o numero de atributos

const produto = Object.preventExtensions({
    nome: 'vassoura',
    preco: 1.99,
    tag: 'Promoção!!'
})

console.log('Extensível:', Object.isExtensible(produto))

produto.nome = 'Borracha'
produto.descricao = 'Borracha escolar Branca'
delete produto.tag
console.log(produto)

// Object.freeze - Congela totalmete o objeto

Object.freeze(produto)
produto.nome = 'mouse'
delete produto.preco

console.log(produto)

// Obejct.seal - Proibe a inclusão e exclusão de atributos, porém possibilita alterar os valores

const pessoa = {nome: 'Naryeli', idade: 18}
Object.seal(pessoa)
console.log('Selado:', Object.isSealed(pessoa))

pessoa.nome = 'Kauã'
pessoa.personalidade = 'Calmo'
delete pessoa.idade
console.log(pessoa)