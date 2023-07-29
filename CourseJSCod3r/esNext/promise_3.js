function gerarNmrEntre(min, max){
    if(min > max) [max, min] = [min, max]

    return new Promise(resolve => {
        const aleatorio = parseInt(Math.random() * (max - min + 1)) + min
        resolve(aleatorio)
    })
    
}

gerarNmrEntre(10, 30)
    .then(num => console.log(num.toFixed(2)))
