pricePen = float(input("Enter the price of pen: "))
qntPen = int(input("Enter the quantity of pen: "))

pricePencil = float(input("Enter the price of pencil: "))
qntPencil = int(input("Enter the quantity of pencil: "))

priceBook = float(input("Enter the price of book: "))
qntBook = int(input("Enter the quantity of book: "))

priceBook -= (priceBook*0.20)
pricePen -= (pricePen*0.05)

print(f"\nORDER:\n"
    f"Value book: R${qntBook*priceBook:.2f}\n"
    f"Value pen: R${qntPen*pricePen:.2f}\n"
    f"Value pencil: R${qntPencil*pricePencil:.2f}\n")
