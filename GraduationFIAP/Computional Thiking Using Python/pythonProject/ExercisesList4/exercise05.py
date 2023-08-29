average = float(input("Enter the student's annual average: "))

if average >= 6.0:
    print("Student is approved.")
elif 3.0 <= average < 6.0:
    print("Student is taking an exam.")
else:
    print("Student is failed.")
