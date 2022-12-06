# 7. Write a Python function that takes a number as a parameter and check the number is prime or not.

def aabb(n):
    if n < 2:
        return False
        # 2 is the only even prime number
    if n == 2:
        return True
        # all other even numbers are not primes
    if not n & 1:
        return False
        # range starts with 3 and only needs to go up the squareroot of n
        # for all odd numbers
    for x in range(3, int(n ** 0.5) + 1, 2):
        if n % x == 0:
            return False
    return True


print(aabb(5))
