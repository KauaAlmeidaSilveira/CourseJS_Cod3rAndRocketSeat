monthNumber = int(input("Enter the month number (1-12): "))

# O fato de não existir um Switch Case me deixou bem intrigado, mas tudo bem...

if monthNumber == 1:
    monthNumber = "January"
elif monthNumber == 2:
    monthNumber = "February"
elif monthNumber == 3:
    monthNumber = "March"
elif monthNumber == 4:
    monthNumber = "April"
elif monthNumber == 5:
    monthNumber = "May"
elif monthNumber == 6:
    monthNumber = "June"
elif monthNumber == 7:
    monthNumber = "July"
elif monthNumber == 8:
    monthNumber = "August"
elif monthNumber == 9:
    monthNumber = "September"
elif monthNumber == 10:
    monthNumber = "October"
elif monthNumber == 11:
    monthNumber = "November"
elif monthNumber == 12:
    monthNumber = "December"
else:
    monthNumber = "Invalid month"

print("The corresponding month is:", monthNumber)
