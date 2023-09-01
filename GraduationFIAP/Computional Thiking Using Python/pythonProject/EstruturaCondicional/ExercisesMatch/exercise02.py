num = float(input("Enter num: "))
option = int(input("You have 3 options, choose one (1 to 3): "))

match option:
    case 1:
        print(f"Value: {num+5}")
    case 2:
        print(f"Value: {num-4}")
    case 3:
        print(f"Value: {num.__pow__(2)}")
    case _:
        print("Incorrect option !!")
