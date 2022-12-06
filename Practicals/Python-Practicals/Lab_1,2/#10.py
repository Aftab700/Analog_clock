# 10. Python programme to check if a number is prime or not
# 25-9-2021

a = int(input("Enter number = "))
flag = False

if a > 1:
    for i in range(2, a):
        if (a % i) == 0:
            flag = True
            break

if flag:
    print(a, " is not prime number")
else:
    print(a, " is prime number")
