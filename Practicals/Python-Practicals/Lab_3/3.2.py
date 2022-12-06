# 3.2 sorting of dictionary based on Key and value
# 30-9-2021

a = {"a": 1,
     "v": 12,
     "d": 4,
     "x": 5,
     "e": 2,
     "f": 7,
     "r": 6,
     "b": 8,
     "t": 9,
     }
b = sorted(a.items())
c = sorted(a.items(), key=lambda k: (k[1], k[0]))
print("sorting based on Keys   :", b)
print("sorting based on Values :", c)
