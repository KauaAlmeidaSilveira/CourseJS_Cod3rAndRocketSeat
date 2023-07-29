(function calcBhaskara(a, b, c){
    let delta = Math.pow(b, 2) -4*a*c

    if(delta < 0){
        return console.log(`Delta negativo: ${delta}`)
    }else{
        let bhaskara = [(-b+Math.sqrt(delta))/2*a, (-b-Math.sqrt(delta))/2*a]
        return console.log(bhaskara)
    }
    
})(1, -3, -54)