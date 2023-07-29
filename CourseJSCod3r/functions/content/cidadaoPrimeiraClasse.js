// Função em Js é First-Class Object 
// Higher-order function

// criar de forma literal
function fun1(){

}

// Armazenar em uma variavel
const fun2 = function() {}

// Armazenar em um array
const array =  [1, 3, fun2(), function(a, b) {return a+b}, 5]
console.log(array[3](4,6))

// Armazenar em um atributo de um objeto
const obj = {}
obj.falar = function() {return 'Opa!!'}
console.log(obj.falar())

// Passar função como parametro
function run(fun){
    fun()
}

run(function() {console.log('Executando...')})

// Uma função pode retornar/conter uma função
function soma(a, b){
    return function (c){
        console.log(a + b + c)
    }
}

soma(1, 2)(5)

const cincoMais = soma(2,3)
cincoMais(5)