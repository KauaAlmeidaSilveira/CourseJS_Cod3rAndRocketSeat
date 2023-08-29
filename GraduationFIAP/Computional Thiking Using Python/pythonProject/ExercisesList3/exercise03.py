drivenKm = float(input("Enter kilometers driven: "))
liters = float(input("Enter quantity liters: "))

print(f"Consumption expectation: {(drivenKm / liters).__round__(2)} Km/l")
