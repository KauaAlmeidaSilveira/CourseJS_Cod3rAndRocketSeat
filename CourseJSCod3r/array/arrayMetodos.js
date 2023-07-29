const pilotos = ['Vettel', 'Alonso', 'Raikkonen', 'Massa']
pilotos.pop() // Remove o ultimo elemento !!
console.log(pilotos)

pilotos.push('Verstappen') // Adiciona um elemento no final !!
console.log(pilotos)

pilotos.shift() // Remove o primeiro elemento !!
console.log(pilotos)

pilotos.unshift('Hamilton') // Adiciona um elemento no incio do array !!
console.log(pilotos)

pilotos.splice(2, 0, 'Bottas', 'Massa') // Adiciona e remove, a partir do indice que quiser !!
console.log(pilotos)

pilotos.splice(3, 1)
console.log(pilotos)

const algunsPilotos1 = pilotos.slice(2) // Retorna um novo ARRAY, a partir do parametro !!
console.log(algunsPilotos1)

const algunsPilotos2 = pilotos.slice(1, 4)
console.log(algunsPilotos2)

// METODOS: POP(), PUSH(), SHIFT(), UNSHIFT(), SPLICE() E SLICE()