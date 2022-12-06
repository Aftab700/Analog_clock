# 11. Python program to create calculator using function

def cal(a, o, b):
    if o == '+':
        print(a + b)
    elif o == '-':
        print(a - b)
    elif o == '/':
        print(a / b)
    elif o == '*':
        print(a * b)


cal(1, '+', 2)
