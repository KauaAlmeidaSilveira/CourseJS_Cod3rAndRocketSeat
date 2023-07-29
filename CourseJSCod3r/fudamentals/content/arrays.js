const valores = [7.7, 8.9, 6.3, 9.2]
console.log(valores[0], valores[3])
console.log(valores[4])

console.log('-----------------------------------------------')

valores[4] = 10
console.log(valores)
console.log(valores.length)

console.log('-----------------------------------------------')

valores.push({id: 3}, false, null, 'teste')
console.log(valores)

console.log('-----------------------------------------------')

console.log(valores.pop())
delete valores[0]
console.log(valores)

console.log('-----------------------------------------------')

console.log(typeof valores)

console.log('-----------------------------------------------')

const vlr = []

for(let i = 0; i<=10; i++){
    vlr[i] = i
    if(i==10){
        console.log(vlr[i])
    }
}

console.log(vlr.length)


