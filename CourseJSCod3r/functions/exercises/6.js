const jurosSimples = (vlrInicial, taxa, tempo) => {
    return console.log(`Juros Simples: ${(vlrInicial*taxa*tempo+vlrInicial).toFixed(2)}`)
}

const jurosCompostos = (vlrInicial, taxa, tempo) =>{
     return console.log(`Juros Compostos: ${(vlrInicial*Math.pow((1+taxa),tempo)).toFixed(2)}`)
}

jurosSimples(200, 0.1, 12)
jurosCompostos(200, 0.1, 12)