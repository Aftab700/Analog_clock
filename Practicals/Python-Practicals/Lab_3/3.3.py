# 3.3 Python Program to demonstrating Key-Value pair deletion using del,pop,popitem
# 30-9-2021

dict_a = {"a": "apple", "b": "ball", "c": "cat", "d": "dog", "e": "elephant"}
print(dict_a)
# pop
dict_a.pop("a")
print('dict_a.pop("a")')
print(dict_a)
# popitem
dict_a.popitem()
print("dict_a.popitem()")
print(dict_a)
# del
del dict_a["c"]
print('del dict_a["c"]')
print(dict_a)
