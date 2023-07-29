function real(partes, ...valores){
    const resultado =[]
    valores.forEach((vlr, indice) => {
        vlr = isNaN(vlr) ? vlr : `R$${vlr.toFixed(2)}`
        resultado.push(partes[indice], vlr)
    })
    return resultado.join('')
}

const preco = 29.99
const precoParcela = 11
console.log(real `1x de ${preco} ou 3x de ${precoParcela}`)