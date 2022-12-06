# 11. Python program to print even and odd numbers in a list

l1 = [1, 2, 3, 4, 5]
a = []
b = []
for i in l1:
    if i % 2 == 0:
        a.append(i)
    if i % 2 != 0:
        b.append(i)
print(f"even = {a}")
print(f"odd = {b}")