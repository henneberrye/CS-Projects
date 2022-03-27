#Eugene Henneberry
#Programming Languages-SP22-CPSC-46000-LT1
#March 27, 2022
#Programming Languages Week 2 Question 1

#String initilization
sampleString = "abcdefghijklmnopqrstuvwxyz"
spaceToSkip = 3
outPut = ''

#For loop to print 3 indexes and skip three.
for i in range(0, len(sampleString), spaceToSkip * 2):
    outPut += sampleString[i : i + spaceToSkip]
print(str(outPut))