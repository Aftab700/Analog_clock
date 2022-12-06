# 06 Python program to remove duplicate tuples from list of tuples

l1 = [(1, 2), (2, 3), (3, 4), (2, 3), (2, 3), (1, 2)]
l2 = []
print(l1)
a = len(l1)
for i in range(0, a):
    # print(l1[i])
    for j in range(i+1, a):
        # print(j,i)
        if l1[i] == l1[j]:
            l2.append(l1[j])
            break
            # print(j)
for i in l2:
    l1.remove(i)
print(l1)
