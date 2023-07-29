const alunos = [
    {nome: 'Kauã', nota: 7.3},
    {nome: 'Naryeli', nota: 9.2},
    {nome: 'Leandro', nota: 9.8},
    {nome: 'Gleice', nota: 8.7}
]

// Imperativo
let total1= 0
for(let i=0; i<alunos.length; i++){
    total1 += alunos[i].nota
}
console.log(total1/alunos.length)

// Declarativo
const getNota = alunos => alunos.nota
const soma = (total, atual) => total + atual
const total2 = alunos.map(getNota).reduce(soma)
console.log(total2/alunos.length)