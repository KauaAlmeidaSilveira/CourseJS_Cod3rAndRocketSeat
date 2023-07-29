const url = 'http://files.cod3r.com.br/curso-js/funcionarios.json'
const axios = require('axios')

const mulherChinesa = funcionario => funcionario.genero === "F" && funcionario.pais === "China"

const menorSalario = (func, funcAtual) => {
    return func.salario > funcAtual.salario ? func : funcAtual
}


axios.get(url).then(response =>{
    const funcionarios = response.data

    const funcionario = funcionarios.filter(mulherChinesa).reduce(menorSalario)
    console.log(funcionario)
})




