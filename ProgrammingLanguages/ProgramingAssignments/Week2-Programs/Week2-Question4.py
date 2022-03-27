#Eugene Henneberry
#Programming Languages-SP22-CPSC-46000-LT1
#March 27, 2022
#Programming Languages Week 2 Question 4

# Function that defins the tree
def tree(i, o):
    # Variable decleration
    inner = " " * i
    outer = " " * o
    return (f"{outer}/{inner}\{outer}\n" +
            f"{outer}*{inner}*{outer}\n" +
            f"{outer}*{inner}*{outer}\n")

# Function to print the tree
def print_power_tree(n):
    # Variable decleration
    outer = n
    inner = 0
    for i in range(n):
        outer -= 1
        print(tree(inner, outer), end = '')
        inner += 2
# Prints out the three trees with a space between.
print_power_tree(1)
print("\n")
print_power_tree(2)
print('\n')
print_power_tree(3)