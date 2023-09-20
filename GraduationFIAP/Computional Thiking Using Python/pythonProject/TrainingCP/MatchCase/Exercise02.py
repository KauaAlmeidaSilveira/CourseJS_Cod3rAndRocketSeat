operation = int(input("Choose the operation: \n" +
                      "\n1 - Average of the numbers entered" +
                      "\n2 - Highest value of entered numbers" +
                      "\n3 - Smallest value of the numbers entered" +
                      "\n4 - Integer division of entered numbers"+
                      "\nCode: "))

num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

match operation:
    case 1:
        print((num1 + num2) / 2)
    case 2:
        print(max(num1, num2))
    case 3:
        print(min(num1, num2))
    case 4:
        if num2 == 0:
            print("It's not possible to divide by zero")
        else:
            print(num1 // num2)
    case _:
        print("Invalid operation")
