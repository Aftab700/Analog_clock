# 8. Write a Python function that checks whether a passed string is palindrome or not.

def aabb(s):
    s1 = s[len(s)::-1]
    # print(s[int(len(s))::-1])
    if s == s1:
        print(f"{s} is palindrome")
    else:
        print(f"{s} is not palindrome")


aabb("abccba")
