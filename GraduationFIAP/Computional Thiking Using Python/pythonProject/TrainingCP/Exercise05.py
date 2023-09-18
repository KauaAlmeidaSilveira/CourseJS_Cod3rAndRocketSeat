priceFriesPortion = 35
pricePortionPastries = 25
priceBeer = 18

numFriends = int(input("Quantos amigos estão no happy hour? "))
friesQuantity = int(input("Quantas porções de batatas fritas foram consumidas? "))
pastriesQuantity = int(input("Quantas porções de pastéis foram consumidas? "))
beersQuantity = int(input("Quantas cervejas foram consumidas? "))

totalOrder = (friesQuantity * priceFriesPortion) + (pastriesQuantity * pricePortionPastries) + (beersQuantity * priceBeer)

individualBill = totalOrder / (numFriends + 1)

print(f"\nO total do pedido é: R${totalOrder:.2f}")
print(f"O valor individual da conta para cada amigo é: R${individualBill:.2f}")
