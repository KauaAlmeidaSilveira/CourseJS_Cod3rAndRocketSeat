print(
    "01| Caneta 1.20"
    "\n02| Lápis 0.80"
    "\n03| Caderno 4.50"
    "\n04| Borracha 1.00"
    "\n05| Régua 1.50"
)

orderNum = int(input("Enter the product that you want: "))

quantity = int(input("OK! How many you want? "))

match orderNum:
    case 1:
        print(f"ORDER: \n"
              f"Cod - 01\n"
              f"Desc - Pen\n"
              f"Price: {1.20*quantity}")
    case 2:
        print(f"ORDER: \n"
              f"Cod - 02\n"
              f"Desc - Pencil\n"
              f"Price: {0.80*quantity}")
    case 3:
        print(f"ORDER: \n"
              f"Cod - 03\n"
              f"Desc - Book\n"
              f"Price: {4.50*quantity}")
    case 4:
        print(f"ORDER: \n"
              f"Cod - 04\n"
              f"Desc - Rubber\n"
              f"Price: {1*quantity}")
    case 5:
        print(f"ORDER: \n"
              f"Cod - 05\n"
              f"Desc - Ruler\n"
              f"Price: {1.50*quantity}")
    case _:
        print("Product not founded!!")
