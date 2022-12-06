# 3.7 Merging two Dictionary
# 30-9-2021

dict_b = {"a": "Apple", "b": "Ball", "c": "Cat", "x": "xerox"}
dict_a = {"a": "apple", "b": "ball", "c": "cat", "d": "dog", "e": "elephant"}
dict_b.update(dict_a)

print(dict_b)
