Array.prototype.filter2 = function(callback){
    const newArray = []
    for(let i=0; i < this.length; i++){
        if(callback(this[i], i, this)){
            newArray.push(this[i])
        }
    }
    return newArray
}

const produtos = [
    {nome: 'Teclado', preco: 400.00, fragil: true},
    {nome: 'Celular', preco: 2000.00, fragil: true},
    {nome: 'MousePad', preco: 80.00, fragil: false},
    {nome: 'Mouse', preco: 150.00, fragil: true}
]


const caro = produto => produto.preco >= 500
const fragil = produto => produto.fragil

console.log(produtos.filter2(caro).filter2(fragil))