# 4. Python program to check if element exists in list in Python

l1 = [1, 2, 3, 4, 5]
a = 6
b = True
for i in l1:
    if i == a:
        print(f"{a} exists in list")
        b = False
if b:
    print(f"{a} doesn't exists in list")

