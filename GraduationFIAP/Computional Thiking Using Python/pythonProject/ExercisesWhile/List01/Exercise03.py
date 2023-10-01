num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

while num1 < num2:
    num1 += 1

    if num1 < num2:
        print(num1)
