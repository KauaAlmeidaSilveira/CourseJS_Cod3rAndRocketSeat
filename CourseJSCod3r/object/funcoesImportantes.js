const pessoa = {
    nome: 'Kauã',
    idade: 18,
    peso: 63
}

console.log(Object.keys(pessoa))
console.log(Object.values(pessoa))
console.log(Object.entries(pessoa))

Object.entries(pessoa).forEach(e =>{
    console.log(`${e[0]}: ${e[1]}`)
})

Object.defineProperty(pessoa, 'dataNascimento', {
    enumerable: true, // Aparece ou não na função de Objects.keys
    writable: false, // Pode-se alterar o valor ou não
    value: '20/11/2004'
})

pessoa.dataNascimento = '20/10/2004'

console.log(pessoa.dataNascimento)
console.log(Object.keys(pessoa))

// Object.assign

const dest = {a: 1}
const o1 = {b: 2}
const o2 = {c: 3, a: 4}
const obj = Object.assign(dest, o1, o2)
console.log(obj)

Object.freeze(obj)
obj.c = 1234
console.log(obj)