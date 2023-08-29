quantity = int(input("Enter the quantity of apples: "))

costPerApple = 1.30 if quantity < 12 else 1.00

print("Total cost of apples: $", quantity * costPerApple)
