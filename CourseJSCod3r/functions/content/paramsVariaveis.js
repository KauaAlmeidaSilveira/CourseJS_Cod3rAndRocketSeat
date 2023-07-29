// FUNÇÃO SEM PARAMETROS NA CRIAÇÃO E ACESSANDO DEPOIS COM ARGUMENTS

function soma (){
    let soma = 0
    for(i in arguments){
        soma += arguments[i]
    }
    return soma
}

console.log(soma(2,3,5,6,7,5,9))
console.log(soma(2, 4, 6, " kaua", " e ", "nary"))