#Eugene Henneberry
#Programming Languages-SP22-CPSC-46000-LT1
#March 27, 2022
#Programming Languages Week 2 Question 3

import string

class Solution:
    # Function that checks for a balanced expression
    def isBalanced(self, expression: string):
        # Variable declration
        newStack = []
        left = set('([{')
        right = set(')]}')
        pair = {')' : '(' , ']' : '[' , '}' : '{'}
        # For loop to check entered expression against 
        # declared matching brackets.
        for a in expression:
            if a in left:
                newStack.append(a)
            if a in right:
                if not newStack:
                    return False
                elif newStack.pop() != pair[a]:
                    return False
                else:
                    continue
        if not newStack:
            return True
        else:
            return False
# Prints if each expression is true or false.
expression = '((a + b)'
print(Solution().isBalanced(expression))

expression2 = '(((a+b)+c)+d)+e'
print(Solution().isBalanced(expression2))
