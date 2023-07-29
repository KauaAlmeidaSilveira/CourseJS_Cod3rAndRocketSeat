function compras(trabalho1, trabalho2) {
    const comprarSorvete = trabalho1 || trabalho2
    const comprarTv50 = trabalho1 && trabalho2
    // const comprarTv32 = !!(trabalho1 ^ trabalho2) // bitwise xor
    const comprarTv32 = trabalho1 != trabalho2
    const manterSaudavel = !comprarSorvete // operador unário

    return { comprarSorvete, comprarTv50, comprarTv32, manterSaudavel }
}

compras(true, false)

let imprimir = (obj) => {

    if(obj.comprarSorvete == true){
        console.log('Tomou sorvete')
    }else{
        console.log('Não tomou sorvete')
    }

    if(obj.comprarTv50 == true){
        console.log('Comprou Tv de 50p')
    }else{
        console.log('Não comprou Tv de 50p')
    }

    if(obj.comprarTv32 == true){
        console.log('Comprou Tv de 32p')
    }else{
        console.log('Não comprou Tv de 32p')
    }
    
    if(obj.manterSaudavel == true){
        console.log('Se manteu saudavel')
    }else{
        console.log('Não se manteu saudavel')
    }

}

console.log(imprimir(compras))

/*
console.log(compras(true, true))
console.log(compras(true, false))
console.log(compras(false, true))
console.log(compras(false, false))
*/