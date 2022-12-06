# 5. Python program to reverse the complete list.

l1 = [1, 2, 3, 4, 5]
print(l1)

for i in range(0, int(len(l1)/2)):
    a = l1[i]
    l1[i] = l1[len(l1)-1-i]
    l1[len(l1)-1-i] = a
print(l1)
