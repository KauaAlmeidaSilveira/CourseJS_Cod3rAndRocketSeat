// Estrategia 1 para gerar valor padrão
function soma(a, b, c){
    a = a || 1
    b = b || 1
    c = c || 1
    return a + b + c
}

console.log(soma(), soma(1, 2, 3))

// Estrategia 2, 3 e 4 para gerar valor padrão   
function soma1(a, b, c){ 
    a = a !== undefined ? a : 1
    b = 1 in arguments ? b : 1
    c = isNaN(c) ? 1 : c 
    return a + b + c
}

// valor padrão do es2015
function soma3(a = 1, b = 1, c = 1){
    return a + b + c
}

console.log(soma3(), soma3(3), soma3(1, 2, 3))