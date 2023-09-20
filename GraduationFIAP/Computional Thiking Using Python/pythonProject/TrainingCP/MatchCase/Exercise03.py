employeeName = input("Enter employee name: ")
currentSalary = float(input("Enter current salary employee: "))
planWork = input("Enter the work plane (A, B or C): ").lower()

newSalary = currentSalary

match planWork:
    case 'a':
        newSalary += currentSalary * 0.10
    case 'b':
        newSalary += currentSalary * 0.15
    case 'c':
        newSalary += currentSalary * 0.20
    case _:
        print("Invalid plan!")


print(f"{employeeName} employee, your new salary is {newSalary:.2f}$")
