class Pessoa{
    constructor(nome){
        this.nome = nome
    }

    falar(){
        console.log(`Meu nome é ${this.nome}`)
    }
}

const p1 = new Pessoa('João')
p1.falar()


// ----------------------------------------------------------------------------

// Função Factory nada mais é doque uma função no qual retorna um objeto

const criarPessoa = nome =>{
    return{
        falar: () => console.log(`Meu nome é ${nome}`)
    }
} 

const p2 = criarPessoa('Kauã')
p2.falar()
