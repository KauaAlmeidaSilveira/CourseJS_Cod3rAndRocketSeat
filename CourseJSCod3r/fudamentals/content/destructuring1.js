// novo recurso do ES2015

const pessoa = {
    nome: 'Nary',
    idade: 5,
    endereco: {
        logradouro: 'Rua ABC',
        numero: 1000
    },
    conta: {
        ag: 3774,
        num: 999
    }
}

const { nome, idade } = pessoa
console.log(nome, idade)

const { nome: n, idade: i } = pessoa
console.log(n, i)

const { sobrenome, bemHumorada = true } = pessoa
console.log(sobrenome, bemHumorada)

const { endereco: { logradouro: l, numero: nu, cep: c } } = pessoa
console.log(l, nu, c)

const { conta: { ag, num } } = pessoa
console.log(ag, num)