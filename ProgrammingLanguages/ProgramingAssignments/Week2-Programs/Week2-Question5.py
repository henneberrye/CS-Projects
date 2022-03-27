#Eugene Henneberry
#Programming Languages-SP22-CPSC-46000-LT1
#March 27, 2022
#Programming Languages Week 2 Question 5

# Function that takes a list 
# and checks for the missing number
def missingNumber(list):
	numLength = len(list)
	misNum = ((numLength + 1) * (numLength +2) / 2)
	sumList = sum(list)
	return misNum - sumList
list = [3, 5, 2, 1]
number = missingNumber(list)
print(number)
