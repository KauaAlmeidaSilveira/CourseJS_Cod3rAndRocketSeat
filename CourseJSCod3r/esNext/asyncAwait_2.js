function gerarNmrEntre(min, max, nmrUsado){
    if(min > max) [max, min] = [min, max]
    return new Promise((resolve, reject) => {
        const aleatorio = parseInt(Math.random() * (max - min + 1)) + min
        if(nmrUsado.includes(aleatorio)){
            reject('Número repetido')
        }else{
            resolve(aleatorio)
        }
    })
}

async function gerarMegaSena(qtDeNumeros, tentativas = 1) {
    try{
        const nmr = []
        for(let _ of Array(qtDeNumeros).fill()){
            nmr.push(await gerarNmrEntre(1, 60, nmr))
        }
        return nmr
    }catch(e){
        if(tentativas > 10){
            throw "Que chato!!"
        }else{
            gerarMegaSena(qtDeNumeros, tentativas + 1)
        }
    }
    
}

gerarMegaSena(15)
    .then(console.log)
    .catch(console.log)

// gerarNmrEntre(1, 5, [1, 2, 4])
//     .then(console.log)
//     .catch(console.log)