year = int(input("Enter a year: "))

if 1000 <= year <= 2999:
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        print("Leap year.")
    else:
        print("Not a leap year.")
else:
    print("Year is out of range.")
