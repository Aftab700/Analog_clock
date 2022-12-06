# 9. Python function to Display Fibonacci Sequence Using Recursion

def fibo(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibo(n - 1) + fibo(n - 2)


def fiboseq(a):
    for n in range(0, a):
        print(fibo(n), end=" ")
    return 0

fiboseq(11)
