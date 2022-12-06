# 6. Write a Python function that accepts a string and calculate the number of upper case letters and lower case
# letters.

def aabb(s):
    a, b = 0, 0
    for i in s:
        if 'a' <= i <= 'z':
            a += 1
        if 'A' <= i <= 'Z':
            b += 1
    print("lowercase=", a)
    print("uppercase=", b)


aabb("heLlo")
