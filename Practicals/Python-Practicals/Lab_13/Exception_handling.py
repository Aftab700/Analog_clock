# Lab 13:
# Python program that demonstrates exception handling of any 8 built-in exceptions.
import math

try:
    print("1/0")
    print(1/0)
except ZeroDivisionError as e:
    print("ZeroDivisionError:", e)

try:
    a = ['a', 'b']
    print("a = ", a)
    print("a[2]")
    print(a[2])
except IndexError as e:
    print("IndexError:", e)

try:
    a = {'a':1, 'b':2}
    print("a = ", a)
    print("a['c']")
    print(a["c"])
except KeyError as e:
    print("KeyError:", e)

try:
    a = ['a', 'b']
    print("a = ", a)
    print("a['c']")
    print(a["c"])
except TypeError as e:
    print("TypeError:", e)

try:
    assert False, 'The assertion failed'
except AssertionError as e:
    print("AssertionError:", e)

try:
    class A:
        pass
    a = A()
    print(a.attr1)
except AttributeError as e:
    print("AttributeError:", e)

try:
    print(math.exp(1000))
except OverflowError as e:
    print("OverflowError:", e)

try:
    import module_does_not_exist
except ImportError as e:
    print("ImportError:", e)


