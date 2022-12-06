# 3.4 Find the size of Dictionary in Python
# 30-9-2021
import sys

dict_a = {"a": "apple", "b": "ball", "c": "cat", "d": "dog", "e": "elephant"}
print(dict_a)
print("Length of Dictionary : ", len(dict_a))   # find length
print("Size of Dictionary : ", sys.getsizeof(dict_a), "bytes")   # find size in bytes
