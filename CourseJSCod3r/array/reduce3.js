Array.prototype.reduce2 = function(callback){
    let acumulador = this[0]
    for(let i=1; i<this.length; i++){
        acumulador = callback(acumulador, this[i])
    }
    return acumulador
}

const alunos = [
    {nome: 'Kauã', nota: 7.3, bolsista: false},
    {nome: 'Naryeli', nota: 9.2, bolsista: false},
    {nome: 'Leandro', nota: 9.8, bolsista: false},
    {nome: 'Gleice', nota: 8.7, bolsista: true}
]

const todosBolsistas = (resultado, bolsista) => resultado && bolsista

const resultado = alunos.map(a => a.bolsista).reduce2(todosBolsistas)

console.log(resultado)