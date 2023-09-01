num1 = float(input("Enter a first num: "))
num2 = float(input("Enter a second num: "))

operation = int(input("You have four arithmetics operations:\n"
                      "1 - Sum\n"
                      "2 - Subtraction\n"
                      "3 - Multiplication\n"
                      "4 - Division\n"
                      "Please, choose one: "))

match operation:
    case 1:
        print(f"Value: {num1+num2}")
    case 2:
        print(f"Value: {num1-num2}")
    case 3:
        print(f"Value: {num1*num2}")
    case 4:
        print(f"Value: {num1/num2} or {num2/num1}")
    case _:
        print("Incorrect operator !!")
