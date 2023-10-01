numero = int(input("Digite um número positivo (ou 0 para sair): "))

if numero == 0:
    print("Nenhum número foi digitado. Encerrando o programa.")
else:
    soma = 0
    contador = 0
    maior = numero
    menor = numero

    while numero != 0:

        if numero > maior:
            maior = numero
        if numero < menor:
            menor = numero

        soma += numero
        contador += 1

        numero = int(input("Digite um número positivo (ou 0 para sair): "))

    media = soma / contador

    print(f"Média dos números: {media:.2f}")
    print("Maior número digitado:", maior)
    print("Menor número digitado:", menor)
