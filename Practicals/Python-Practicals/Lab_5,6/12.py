# 12. Python program to count positive and negative numbers in a list

l1 = [1, -2, -3, 4, 5]
a = []
b = []
for i in l1:
    if i >= 0:
        a.append(i)
    else:
        b.append(i)
print(f"positive = {a}")
print(f"negative = {b}")
