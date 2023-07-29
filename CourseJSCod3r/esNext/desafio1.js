const fs = require('fs')

const caminho = 'C:/Users/Drummond/Desktop/Kaua/Curso/node/arquivoGerado.json'

// Forma que eu fiz...
fs.readFile(caminho, (err, conteudo) =>{
    return new Promise(resolve => {
        resolve(JSON.parse(conteudo))

    }).then(vlr => console.log(vlr.nome))
})

// Forma que o curso indicou...
function lerArquivo(caminho){
    return new Promise(resolve => {
        fs.readFile(caminho, (err, conteudo) =>{
            resolve(JSON.parse(conteudo))
        })
    })
}

lerArquivo(caminho).then(vlr => console.log(vlr.nome))





