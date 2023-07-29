console.log(typeof Array, typeof new Array, typeof [])

let aprovados = new Array('Gleice', 'Kaua', 'Naryeli')
console.log(aprovados)

aprovados = ['Bia', 'Carlos', 'Ana']
console.log(aprovados[0])
console.log(aprovados[1])
console.log(aprovados[2])
console.log(aprovados[3])

aprovados[3] = 'Paulo'
aprovados.push('Abia')

console.log(aprovados.length)

aprovados[9] = 'Rafael'
console.log(aprovados.length)

console.log(aprovados)
aprovados.sort() // Ordena os atributos do array
console.log(aprovados)

delete aprovados[1]
console.log(aprovados[1])
console.log(aprovados[2])

aprovados = ['Kaua', 'Naryeli', 'Big']
aprovados.splice(1, 0, 'Elemento1', 'Elemento2') // Adiciona e remove, apartir do indice que quiser
console.log(aprovados)

