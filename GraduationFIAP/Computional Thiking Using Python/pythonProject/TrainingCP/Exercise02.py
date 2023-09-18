firstPeopleName = input("Enter your name: ")

firstPeopleHeight = float(input("Enter your height in cm: "))

secondPeopleName = input("Enter your name: ")

secondPeopleHeight = float(input("Enter your height in cm: "))

if firstPeopleHeight > secondPeopleHeight:
    print(f"Tallest person's name: {firstPeopleName}")
else:
    print(f"Tallest person's name: {secondPeopleName}")
