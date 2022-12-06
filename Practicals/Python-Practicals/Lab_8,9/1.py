# 1. Write a Python function to find the Max of three numbers

def fmax(a, b, c):
    if a > b and a > c:
        print(f"{a} is max")
    elif b > a and b > c:
        print(f"{b} is max")
    else:
        print(f"{c} is max")


fmax(3, 1, 3)
fmax(3, 5, 2)
