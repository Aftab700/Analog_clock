# 6. Python program to check if a given string is binary string or not

string1 = '0110101010111'
b = {'0', '1'}
set1 = set(string1)

if b == set1 or set1 == {'0'} or set1 == {'1'}:
    print("String1 is a binary string.")
else:
    print("String1 is not a binary string.")

string2 = '0120101010111'
set2 = set(string2)
# print(set2)
if b == set2 or set2 == {'0'} or set2 == {'1'}:
    print("String2 is a binary string.")
else:
    print("String2 is not a binary string.")
