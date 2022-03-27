#Eugene Henneberry
#Programming Languages-SP22-CPSC-46000-LT1
#March 27, 2022
#Programming Languages Week 2 Question 2

#Variable decleration
inputStr = 'abaaababbbbaaabbabababababbbaaaaabababababbbbb';
patternStr = 'abb'

# Function to find the pattern
def indexLocation(string, b):
    flag = False;
    for a in range(len(string)):
        if (string[a:a + len(b)] == b):
            print(a, end = " ");
            flag = True;
    if (flag == False):
        print("[]");

# Printing out the locations of the pattern.
print(indexLocation(inputStr,patternStr));

