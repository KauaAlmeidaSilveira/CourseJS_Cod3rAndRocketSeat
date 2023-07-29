function funcionarOuNao(vlr, chanceDeErr ) {
    return new Promise((resolve, reject) => {
        try{
            if(Math.random() < chanceDeErr){
                reject('Ocorreu um erro!!')
            }else{
                resolve(vlr)
            }
        }catch(err){
            reject(err)
        }
        
    })
}

funcionarOuNao('Testando', 0.5)
    .then(vlr => console.log(`Valor: ${vlr}`))
    .catch(err => console.log(`Erro: ${err}`))