def Balanced(exp):
    # Initialising Variables
    flag = True
    count = 0

    # Traversing the Expression
    for i in range(len(exp)):
        if (exp[i] == '()'):
            count += 1
        else:
            count -= 1

        if (count < 0):
            flag = False
            break

    if (count != 0):
        flag = False
    return flag

if __name__ == '__main__':
    exp1 = "((()))"
    if (Balanced(exp1)):
        print("Balanced")
    else:
        print("Not Balanced")

    exp2 = "())((())"
    if (Balanced(exp2)):
        print("Balanced")
    else:
        print("Not Balanced")
