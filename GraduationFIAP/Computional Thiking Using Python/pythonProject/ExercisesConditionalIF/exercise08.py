bookPrice = float(input("Enter the book price: "))

if bookPrice <= 10.00:
    discount = bookPrice * 0.08
elif 10.01 <= bookPrice <= 60.00:
    discount = bookPrice * 0.10
else:
    discount = bookPrice * 0.20

print("Discount offered: $", discount)
