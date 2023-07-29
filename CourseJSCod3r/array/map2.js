const carrinho = [
    '{"nome": "Borracha", "preco": 3.45}',
    '{"nome": "Mouse", "preco": 35}',
    '{"nome": "Teclado", "preco": 198.02}',
    '{"nome": "Fone", "preco": 57.98}'
]

// Retornar um array apenas com os preços
const jsonToObject = e => JSON.parse(e)
const onlyValue = e => `R$ ${parseFloat(e.preco).toFixed(2).replace('.', ',')}`


let result = carrinho.map(jsonToObject).map(onlyValue)

console.log(result)