function gerarNmrEntre(min, max, tempo){
    if(min > max) [max, min] = [min, max]
    return new Promise(resolve => {
        setTimeout(function(){
            const aleatorio = parseInt(Math.random() * (max - min + 1)) + min
            resolve(aleatorio)
        }, tempo)
    })
}

function gerarVariosNmr(){
    return Promise.all([
        gerarNmrEntre(1, 60, 4000),
        gerarNmrEntre(1, 60, 1000),
        gerarNmrEntre(1, 60, 500),
        gerarNmrEntre(1, 60, 3000),
        gerarNmrEntre(1, 60, 100),
        gerarNmrEntre(1, 60, 1500)
    ])
}

gerarVariosNmr()
    .then(console.log)