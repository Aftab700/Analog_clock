# 03 Python program for adding tuple to list and vice – versa

a = (1, 2, 3, 4)
l1 = ['a', 'b', 'c']
l1 += a
print("adding tuple to list\nlist=", end=" ")
print(l1)
a = a + tuple(l1)
print("adding list to tuple\ntuple=", end=" ")
print(a)
