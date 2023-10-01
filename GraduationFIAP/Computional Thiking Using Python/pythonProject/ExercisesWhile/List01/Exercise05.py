num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

par = 0
impar = 0

while num1 <= num2:
    if num1 % 2 == 0:
        par += 1
    else:
        impar += 1

    num1 += 1

print(f"Pares: {par}")
print(f"Impares: {impar}")