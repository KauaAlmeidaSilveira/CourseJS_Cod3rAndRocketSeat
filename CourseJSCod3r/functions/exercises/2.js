(function tipoTriangulo(x, y, z){
    if(x==y & y==z){
        return console.log(`É um triângulo equilátero`)
    }else if(x!=y & x!=z & y==z || y!=x & y!=z & x==z || z!=x & z!=y & y==x){
        return console.log(`É um triângulo isóceles`)
    }else{
        return console.log(`É um triângulo escaleno`)
    }
})(10,10,5)