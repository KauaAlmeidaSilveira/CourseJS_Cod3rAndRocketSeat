const notas = [5, 4, 9, 10, 8.5, 7.2, 6.5]

// Sem callBack

let menorQueSete = []
for(let i in notas){
    if(notas[i] < 7){
        menorQueSete.push(notas[i])
    }
}

console.log(menorQueSete)

// Com callBack

let menorQueSete2 = notas.filter(notas => notas < 7)

console.log(menorQueSete2)