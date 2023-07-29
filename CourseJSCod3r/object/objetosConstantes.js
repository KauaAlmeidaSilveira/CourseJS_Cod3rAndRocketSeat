// Por mais que o objeto esteja dentro de uma constante é possivel alterar atributos seus atributos, pois no final
// a variavel continua apontando para um objeto 

const pessoa = {

}

console.log(pessoa)

// pessoa = 'kaua'  <- INCORRETO !!

pessoa.nome = 'Kaua'

console.log(pessoa)