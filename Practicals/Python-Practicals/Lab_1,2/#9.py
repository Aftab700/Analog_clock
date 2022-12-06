# 9. Python programme to find largest among three numbers
# 25-9-2021

a = int(input("Enter number = "))
b = int(input("Enter number = "))
c = int(input("Enter number = "))

if (a > b) & (a > c):
    print(a, "is largest number")
elif (b > a) & (b > c):
    print(b, " is largest number")
else:
    print(c, " is largest number")
