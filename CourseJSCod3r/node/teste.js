const funcionario = [
    {
        nome: 'kaua',
        salario: 2000
    },{
        nome: 'leandro',
        salario: 5000
    },{
        nome: 'gleice',
        salario: 1000
    }
]

const menorSalario = funcionario.reduce(function(func, funcionarioAtual){
    return func.salario < funcionarioAtual.salario ? func : funcionarioAtual
})

console.log(menorSalario)