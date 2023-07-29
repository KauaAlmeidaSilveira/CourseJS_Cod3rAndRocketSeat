Array.prototype.map2 = function(callback){
    const newArray = []
    for(let i=0; i<this.length; i++){
        newArray.push(callback(this[i], i, this))
    }
    return newArray
}

const carrinho = [
    '{"nome": "Borracha", "preco": 3.45}',
    '{"nome": "Mouse", "preco": 35}',
    '{"nome": "Teclado", "preco": 198.02}',
    '{"nome": "Fone", "preco": 57.98}'
]

// Retornar um array apenas com os preços
const jsonToObject = e => JSON.parse(e)
const onlyValue = e => `R$ ${parseFloat(e.preco).toFixed(2).replace('.', ',')}`

let result = carrinho.map2(jsonToObject).map2(onlyValue)

console.log(result)
