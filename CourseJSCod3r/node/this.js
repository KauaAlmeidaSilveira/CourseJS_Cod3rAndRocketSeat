console.log(this === global)
console.log(this === module)

console.log(this === module.exports)
console.log(this === exports)

function logThis(){   // This dentro de uma função aponta para global, fora ele aponta para module.exports
    console.log('Dentro de uma função...')
    console.log(this === exports)
    console.log(this === module.exports)
    console.log(this === global)
}

logThis()

// !! Vale lembrar que this dentro de uma arrow function, ele aponta para module.exports
