console.log(soma(4, 5))
// console.log(subtracao(10, 5))
// console.log(mult(10, 5))

// Quando a função é declarada dentro de uma variavel só é possivel chama-la depois de sua criação...
// Por isso nem a function expression e a Named function expression funcionam..


// function declaration
function soma(x, y){
    return x + y
}


// function expression
const subtracao = function (x, y){
    return x - y
}

// named function expression
const mult = function mult(x, y){
    return x*y
}

