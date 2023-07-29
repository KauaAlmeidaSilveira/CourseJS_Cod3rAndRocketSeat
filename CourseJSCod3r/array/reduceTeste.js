Array.prototype.reduce2 = function(callback){
    let acumulador = this[0]
    for(let i=1; i<this.length; i++){
        acumulador = callback(acumulador, i)
    }
    return acumulador
}

const todosBolsistas = (acumulador, atual) => acumulador&&atual

const alunos = [
    {nome: 'Kauã', nota: 7.3, bolsista: false},
    {nome: 'Naryeli', nota: 9.2, bolsista: false},
    {nome: 'Leandro', nota: 9.8, bolsista: false},
    {nome: 'Gleice', nota: 8.7, bolsista: true}
]

console.log(alunos.map(a => a.bolsista).reduce2(todosBolsistas))


