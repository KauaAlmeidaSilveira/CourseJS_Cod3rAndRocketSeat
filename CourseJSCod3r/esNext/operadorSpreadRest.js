// Operador ... rest(Juntar)/ spread(Espalhar)
// usar rest com parâmetro de função

// usa spread com objeto
const funcionario = {nome: 'Maria', salario: 12348.99}
const clone = {ativo: true, ...funcionario}
console.log(clone)

// usar spread em array
const grupoA = ['Joao', 'Pedro', 'Gloria']
const grupoFinal = ['Maria', ...grupoA]
console.log(grupoFinal)