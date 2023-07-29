const produtos = [
    {nome: 'Teclado', preco: 400.00, fragil: true},
    {nome: 'Celular', preco: 2000.00, fragil: true},
    {nome: 'MousePad', preco: 80.00, fragil: false},
    {nome: 'Mouse', preco: 150.00, fragil: true}
]

console.log(produtos.filter(function(p){
    return p.preco == 400
}))

const caro = produto => produto.preco >= 500
const fragil = produto => produto.fragil

console.log(produtos.filter(caro).filter(fragil))