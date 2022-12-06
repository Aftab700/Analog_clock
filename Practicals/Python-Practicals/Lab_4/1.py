#1. Find the size of a Set in Python

import sys

# sample Sets
Set1 = {1, 2, 3, 4, 5}
Set2 = {"a", "b", "c", "d", "e"}
Set3 = {(1, "a"), (2, "b"), (3, "c"), (4, "d"), (5, "e")}

# print the sizes of sample Sets
print("Size of Set1: " + str(sys.getsizeof(Set1)) + "bytes")
print("Size of Set2: " + str(sys.getsizeof(Set2)) + "bytes")
print("Size of Set3: " + str(sys.getsizeof(Set3)) + "bytes")
