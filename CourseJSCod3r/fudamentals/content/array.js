const vlr = [8, 8.9, 6.6, 5]
console.log(vlr[2])
console.log(vlr[2], vlr[0])

console.log(vlr[4])

vlr[4] = 3

console.log(vlr[4])

console.log(vlr.length)

vlr.push({name: 'kaua'}, false, 'nary', null)

console.log(vlr.length)

console.log(vlr)

console.log(vlr.pop())  // elimina o ultimo elemento do array

console.log(vlr)

delete vlr[0]

console.log(vlr)

console.log(typeof vlr)