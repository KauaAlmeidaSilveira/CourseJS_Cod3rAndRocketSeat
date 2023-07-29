function criarProduto(nome= 'Mouse', preco = 120){
        return {
            nome,
            preco,
            precoComDesconto: preco-20
        }
}

console.log(criarProduto())

console.log(criarProduto('Teclado', 220))