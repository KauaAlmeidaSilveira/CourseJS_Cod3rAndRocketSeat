qntNumbers = int(input("Enter of quantity numbers: "))

sumNumbers = 0

for i in range(qntNumbers):
    number = float(input(f"Enter number #{i+1}: "))

    if number < 40:
        sumNumbers += number

print(f"Sum of numbers: {sumNumbers}")
