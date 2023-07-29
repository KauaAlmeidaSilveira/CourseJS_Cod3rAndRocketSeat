const escola = [{
    nome: 'Turma M1',
    alunos: [{
        nome: 'Kauã',
        nota: 8.1
    }, {
        nome: 'Naryeli',
        nota: 9.3
    }]
},{
    nome: 'Turma M2',
    alunos: [{
        nome: 'Leandro',
        nota: 8.9
    },{
        nome: 'Gleice',
        nota: 7.3
    }]
}]

const getNotaAluno = a => a.nota
const getNotaTurma = turma => turma.alunos.map(getNotaAluno)

const notas1 = escola.map(getNotaTurma)
console.log(notas1)

Array.prototype.flatMap = function(callback){
    return Array.prototype.concat.apply([], this.map(callback))
}

const notas2 = escola.flatMap(getNotaTurma)
console.log(notas2)
