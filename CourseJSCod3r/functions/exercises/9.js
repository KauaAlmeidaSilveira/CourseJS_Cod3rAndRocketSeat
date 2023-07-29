(function notaFinal(nota){
    let multiplosDeCinco = []

    for(let i= 8; i<=20; i++){
        multiplosDeCinco[i]= 5*i
    }
    
    if(nota < 38){
        console.log(`Aluno reprovado`)
    }else if(nota >= 38){
        let vlrControle = 0
        for(let i=0; i<=multiplosDeCinco.length; i++){
            if(nota == multiplosDeCinco[i]){
                console.log(`Aluno aprovado, nota: ${nota}`)
            }
        }
        if(nota != 40 && nota > 38){
            vlrControle = Math.round(nota/5)
            console.log(`Aluno aprovado, nota: ${5*vlrControle}`)
        }
        
    }
})(48)
