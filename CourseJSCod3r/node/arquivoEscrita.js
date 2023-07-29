const fs = require('fs')

const caminho = __dirname + '/arquivoGerado.json'

const produto = {
    nome: 'Celular',
    preco: 1249.99,
    desconto: 0.15
}

fs.writeFile(caminho, JSON.stringify(produto), err => console.log(err || 'Arquivo gerado!'))