# 17. Python program for cube sum of first n natural numbers
# 28-9-2021

n = int(input("n = "))
a = 0
for i in range(1, n+1):
    a += i**3
print("cube sum of ", n, "=", a)
