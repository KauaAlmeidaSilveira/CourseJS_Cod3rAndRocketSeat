function Pessoa(nome= 'Indivíduo'){
    this.nome = nome
    this.falar = () => console.log(`Meu nome é ${nome}`)
}

const p1 = new Pessoa('Kauã')
p1.falar()


// ----------------------------------------------------------------------------

function criarPessoa(nome= 'Indivíduo2'){
    return{
        falar: () => console.log(`Meu nome é ${nome}`)
    }
}

const p2 = criarPessoa('Naryeli')
p2.falar()