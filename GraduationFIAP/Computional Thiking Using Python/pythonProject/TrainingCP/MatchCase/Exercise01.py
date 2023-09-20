productCode = int(input("Enter the product code: "))

qnt = int(input("Enter the quantity of the product: "))

match productCode:
    case 100:
        print(f"Valor total= {qnt*1.70}")
    case 101:
        print(f"Valor total= {qnt*2.30}")
    case 102:
        print(f"Valor total= {qnt*2.60}")
    case 103:
        print(f"Valor total= {qnt*2.40}")
    case 104:
        print(f"Valor total= {qnt*1.00}")
    case _:
        print("Invalid product code!")
