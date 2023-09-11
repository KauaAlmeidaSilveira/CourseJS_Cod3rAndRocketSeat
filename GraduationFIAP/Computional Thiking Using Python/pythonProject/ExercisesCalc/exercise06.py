total_voters = int(input("Enter the total number of voters: "))
white_votes = int(input("Enter the number of white votes: "))
null_votes = int(input("Enter the number of null votes: "))
valid_votes = int(input("Enter the number of valid votes: "))

percentage_blank = (white_votes / total_voters) * 100
percentage_null = (null_votes / total_voters) * 100
percentage_valid = (valid_votes / total_voters) * 100

print(f"Percentage of blank votes: {percentage_blank}%")
print(f"Percentage of null votes: {percentage_null}%")
print(f"Percentage of valid votes: {percentage_valid}%")
