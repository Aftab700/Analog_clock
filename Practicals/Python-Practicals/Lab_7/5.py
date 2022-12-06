# 05 Python program to test if tuple is distinct

tuple1 = (1, 2, 3, 4)
a = len(set(tuple1)) == len(tuple1)
print("tuple is distinct=", a)
