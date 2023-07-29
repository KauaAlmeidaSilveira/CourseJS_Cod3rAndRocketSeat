const primeiroElemento = vlr => vlr[0]
const primeiraLetra = vlr => vlr[0]
const paraMaiuscula = vlr => vlr.toUpperCase()

let p = new Promise(function(resolve) {
    resolve(['kaua', 'nary', 'leandro', 'gleice'])
})

p
    .then(primeiroElemento)
    .then(primeiraLetra)
    .then(paraMaiuscula)
    .then(console.log)

