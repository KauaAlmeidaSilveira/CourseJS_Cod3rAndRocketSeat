const alunos = [
    {nome: 'Kauã', nota: 7.3, bolsista: false},
    {nome: 'Naryeli', nota: 9.2, bolsista: true},
    {nome: 'Leandro', nota: 9.8, bolsista: false},
    {nome: 'Gleice', nota: 8.7, bolsista: true}
]

const resultado = alunos.map(a => a.nota).reduce(function(acumulador, atual){
    console.log(acumulador, atual)
    return acumulador + atual
})

console.log(resultado)