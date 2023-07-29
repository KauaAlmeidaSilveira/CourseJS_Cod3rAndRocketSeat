function Carro (velocidadeMax= 200, delta=5){
    // atributo privado
    let velocidadeAtual = 0

    // metodo publico
    this.acelerar = function(vezes= 1){
        if(velocidadeAtual + delta <= velocidadeMax){
            velocidadeAtual += vezes*delta
        }else{
            velocidadeAtual = velocidadeMax
        }
    }

    // metodo publico

    this.getVelocidadeAtual = function(){
        return velocidadeAtual
    }

}


const uno = new Carro
uno.acelerar()
console.log(uno.getVelocidadeAtual())

const ferrari = new Carro(350, 20)
ferrari.acelerar(3)
console.log(ferrari.getVelocidadeAtual())
