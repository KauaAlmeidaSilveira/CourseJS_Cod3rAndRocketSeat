numbers = []

for num in range(1, 21):
    numbers.append(num)

sumEvenNumbers = 0

for num in numbers:
    if num % 2 == 0:
        sumEvenNumbers += num

print(f"Sum of even numbers: {sumEvenNumbers}")
