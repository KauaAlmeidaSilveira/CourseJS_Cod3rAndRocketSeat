function vlrInverso(vlr){
    if(typeof(vlr) === typeof(true)){
        if(vlr == true){
            return console.log(false)
        }else{
            return console.log(true)
        }
    }else if(typeof(vlr) === typeof(1)){
        return console.log(vlr*-1)
    }else{
        return console.log(`Booleano ou número esperados, maso parâmetro é do tipo ${typeof(vlr)}`)
    }
}

vlrInverso(10)

// console.log(typeof(10))
// console.log(typeof(true))
// console.log(typeof(Number))
// console.log(typeof(Boolean))

