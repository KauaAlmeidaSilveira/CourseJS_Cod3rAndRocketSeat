const nums = [1, 2, 3, 4, 5]

// Map é um for com um em cada elemento propósito
let resultado = nums.map(function(e){
    return e * 2
})

console.log(resultado, nums)

const somaDez = e => e + 10
const triplo = e => e*3
const paraDinheiro = e => `R$ ${parseFloat(e).toFixed(2).replace('.', ',')}`

resultado = nums.map(somaDez).map(triplo).map(paraDinheiro)
console.log(resultado)