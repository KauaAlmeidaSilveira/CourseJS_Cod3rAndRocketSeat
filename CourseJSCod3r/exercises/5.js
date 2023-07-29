const maiorOuIgual = (vlr1, vlr2) => {
    if(typeof(vlr1) != typeof(vlr2)){
        return console.log(false)
    }else if(vlr1>=vlr2){
        return console.log(true)
    }
}

maiorOuIgual(0, 0)
maiorOuIgual(0, "0")
maiorOuIgual(5, 1)

