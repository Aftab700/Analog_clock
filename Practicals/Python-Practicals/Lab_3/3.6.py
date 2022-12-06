# 3.6 Handling missing Keys in Dictionary
# 30-9-2021

dict_a = {"a": "apple", "b": "ball", "c": "cat", "d": "dog", "e": "elephant"}
c = True
while c:
    try:
        b = input("Enter Key to search in Dictionary = ")
        print(" value in Dictionary = ", dict_a[b])
        c = False
    except KeyError:
        print("Key not found in Dictionary!, Try again")
