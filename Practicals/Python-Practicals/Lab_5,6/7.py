# 7. Python program to count occurrence of elements in the list

l1 = [1, 2, 3, 4, 5, 1, 3, 3, 4, 4, 4]
a = 1
n = 0
for i in l1:
    if i == a:
        n += 1
print(f"{a} occurred {n} times in list")
