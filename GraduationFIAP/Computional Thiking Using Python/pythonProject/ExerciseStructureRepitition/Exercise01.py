numbers = []

for num in range(1, 31):
    numbers.append(num)

for num in numbers:
    if num % 4 == 0:
        index = numbers.index(num)
        numbers[index] = "PIM"

# ou

'''
for index, num in enumerable(numbers):
        if num % 4 == 0:
            numbers[index] = "PIM"
'''

print(numbers)
