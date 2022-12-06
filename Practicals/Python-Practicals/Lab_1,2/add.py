# write a programme that takes two numbers as command line arguments
# 24-9-2021

import sys

x = int(sys.argv[1])  # arg 1
y = int(sys.argv[2])  # arg 2

a = x + y
print(x, "+", y, "=", a)
