let registroPontos = "10,20,20,8,25,3,0,30,1"

function  admPontos (pontuacoes){
    let pontos = pontuacoes.split(",")
    let recordes= 0
    let menorPontuacao = pontos[0]
    let maiorPontuacao = 0
    let piorJogo = 1
    for(let i=0; i<pontos.length; i++){
        if(pontos[i] > maiorPontuacao){
            maiorPontuacao = pontos[i]
            recordes++
        }else if(pontos[i] < menorPontuacao){
            menorPontuacao= pontos[i]
            piorJogo = i+1
        }
    }
    return console.log([recordes, piorJogo])
}

admPontos(registroPontos)
