# 5. Python program to demonstrate all bultin set functions.

set1 = {1, 2, 3, 4, 5}
set2 = {1, 2, 'a', 6, 8}
set1.add(10)
print("add(10)")
print(set1)
set1.clear()
print("set1.clear()")
print(set1)
print(set2.copy())
set1 = {1, 2, 3, 4, 5}
print(set1)
print("difference() ", set1.difference(set2))
print(set1)
print("difference_update() ", set1.difference_update(set2))
print(set1)
set1.discard(5)
print("set1.discard(5)")
print(set1)
set1.update(set2)
print("set1.update(set2)")
print(set1)
print("intersection() ", set1.intersection(set2))
set1.intersection_update(set2)
print("set1.intersection_update(set2)")
print(set1)
print("set1.isdisjoint(set2)", set1.isdisjoint(set2))
print("set1.issubset(set2)", set1.issubset(set2))
print("set1.issuperset(set2) ", set1.issuperset(set2))
print("set1.symmetric_difference(set2) ", set1.symmetric_difference(set2))
print("set1.symmetric_difference_update(set2) ", set1.symmetric_difference_update(set2))
print("set1.union()", set1.union())



