# 6. Python programme to find area of triangle
# 25-9-2021
a = float(input("Enter first side = "))
b = float(input("Enter second side = "))
c = float(input("Enter third side = "))

s = (a+b+c) / 2
area = (s*(s-a)*(s-b)*(s-c))** 0.5

print("Area of triagle is = ", area)
