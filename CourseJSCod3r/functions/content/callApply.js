function getPreco(imposto = 0, moeda= 'R$'){
    return `${moeda} ${this.preco * (1 - this.desc) * (1 + imposto)}`
}

const produto = {
    nome: 'Notebook',
    preco: 4589,
    desc: 0.15,
    getPreco
}

console.log(produto.getPreco())

const carro = {preco: 2000, desc: 0.50}

// Call e Apply serve para dar contexto a qual a função ira ser executada...

console.log(getPreco.call(carro))
console.log(getPreco.apply(carro))

// A principal diferença entre Call e Apply é na forma em que os parametros são chamados...

console.log(getPreco.call(carro, 0.50, '$'))
console.log(getPreco.apply(carro, [0.50, '$']))

