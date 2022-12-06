# 1. Python program to interchange first and last elements in a list

l1 = [1, 2, 3, 4, 5]
print(l1)
a = l1[0]
l1[0] = l1[len(l1)-1]
l1[len(l1)-1] = a
print(l1)

