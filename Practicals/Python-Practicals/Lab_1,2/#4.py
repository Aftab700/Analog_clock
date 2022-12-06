# 4. Python programme to print simple calculator
# 25-9-2021
a = int(input("value1 = "))
c = input("operator = ")
b = int(input("value2 = "))
if c == "+":
    print(" ", a, "\n+", b, "\n---------\n=", (a+b))
elif c == "-":
    print(" ", a, "\n-", b, "\n---------\n=", (a-b))
elif c == "*":
    print(" ", a, "\n*", b, "\n---------\n=", (a*b))
elif c == "/":
    print(" ", a, "\n/", b, "\n---------\n=", (a / b))

