weight = float(input("Enter your weight in kilograms: "))
height = float(input("Enter your height in meters: "))

imc = weight / (height * height)

if imc <= 18.5:
    situation = "Under weight"
elif 18.5 < imc <= 24.9:
    situation = "Ideal weight"
else:
    situation = "Overweight"

print(f"Your situation based on IMC is: {situation}")
