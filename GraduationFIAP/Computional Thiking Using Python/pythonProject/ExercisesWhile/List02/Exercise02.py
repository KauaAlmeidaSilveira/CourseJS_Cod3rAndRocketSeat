total = 0

while True:
    preco = float(input("Digite o preço do produto (ou 0 para encerrar a compra): "))

    if preco == 0:
        break

    quantidade = int(input("Digite a quantidade desse produto: "))

    subtotal = preco * quantidade
    total += subtotal

print("Total da compra: R$", total)
