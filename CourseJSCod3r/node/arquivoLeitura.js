const fs = require('fs')

const caminho = __dirname + '/arquivo.json'

// sincrono.... - Forma não recomendada
const conteudo = fs.readFileSync(caminho, 'utf-8')
console.log(conteudo)

// assincrono...
fs.readFile(caminho, 'utf-8', (err, conteudo) => {
    const config = JSON.parse(conteudo)
    console.log(`${config.db.host}:${config.db.port}`)
})

const config = require('./arquivo.json')
console.log(config.db)

fs.readdir(__dirname, (err, arquivos)=>{
    console.log('Conteúdo da pasta...')
    console.log(arquivos)
    // Localizando um arquivo em específico
    for(let i=0; i<arquivos.length; i++){
        if(arquivos[i] == 'arquivo.json'){
            console.log(arquivos[i])
        }
    }
})