# 5. Write a Python function to check whether a number falls in a given range

def nfr(a, b, c):
    if a in range(b,c):
        print("number is in range")
    else:
        print("number is not in range")


nfr(5, 0, 10)
