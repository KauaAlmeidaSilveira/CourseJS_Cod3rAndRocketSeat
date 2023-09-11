qntStudents = int(input("Enter the quantity of students: "))

gradesAll = []

for i in range(qntStudents):
    grades = []

    for gradeNumber in range(0, 3):
        grade = float(input(f"Write your grade in the {gradeNumber + 1}º test: "))
        grades.append(grade)

    gradeLowest = grades[0]

    for grade in grades:
        if gradeLowest > grade:
            gradeLowest = grade

    twoHighestGrades = []

    for grade in grades:
        if grade != gradeLowest:
            twoHighestGrades.append(grade)

    average = (twoHighestGrades[0]+twoHighestGrades[1])/2
    gradesAll.append(average)
    print(f"Student average {i+1}: {average}")

print("\nStudents Grades")

for i, grade in enumerate(gradesAll):
    print(f"Student average {i+1}: {grade}")
