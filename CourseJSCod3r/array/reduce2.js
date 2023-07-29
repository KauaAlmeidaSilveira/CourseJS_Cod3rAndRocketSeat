const alunos = [
    {nome: 'Kauã', nota: 7.3, bolsista: false},
    {nome: 'Naryeli', nota: 9.2, bolsista: false},
    {nome: 'Leandro', nota: 9.8, bolsista: false},
    {nome: 'Gleice', nota: 8.7, bolsista: true}
]

// Desafio 1: Todos os alunos são bolsistas?
const todosBolsistas = (resultado, bolsista) => resultado && bolsista
console.log(alunos.map(a => a.bolsista).reduce(todosBolsistas))

// Desafio 2: Algum aluno é bolsista ?
const algumBolsista = (resultado, bolsista) => resultado || bolsista
console.log(alunos.map(a => a.bolsista).reduce(algumBolsista))


