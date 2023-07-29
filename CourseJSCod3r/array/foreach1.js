const aprovados = ['kaua', 'nary', 'leandro', 'gleice', 'joao']

aprovados.forEach((nome, i) => console.log(`${i+1}) ${nome}`))

const exibirAprovados = aprovado => console.log(aprovado)
aprovados.forEach(exibirAprovados)

