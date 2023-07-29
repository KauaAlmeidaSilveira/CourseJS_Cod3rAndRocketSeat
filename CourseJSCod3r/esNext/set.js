// não aceita repetição / não é indexado
const times = new Set()
times.add('Vasco')
times.add('São Paulo').add('Palmeiras').add('Corinthians')
times.add('Vasco')
console.log(times)
console.log(times.size)
console.log(times.has('Corinthians'))

const nome = ['nary', 'julia', 'kaua', 'nary']
const nomes = new Set(nome)
console.log(nomes)