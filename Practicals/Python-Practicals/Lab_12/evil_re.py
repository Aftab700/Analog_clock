# Lab Project : Understand what is vulnerable regular expressions, demonstrate
# that how you can deploy a python script that demonstrate early detection of DoS Attack
#  by identifying evil RegEx or vulnerable regEx.

import re
import time
test_list = ["aaaa",
             "aaaaaaaa",
             "aaaaaaaaaaaa",
             "aaaaaaaaaaaaaaaa",
             "aaaaaaaaaaaaaaaaaaaa",
             "aaaaaaaaaaaaaaaaaaaaaaaa",
             "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" ]

evil_rex = r"^(a|a?)+b$"
for s in test_list:
    start_ts = time.perf_counter()
    re.search(evil_rex, s)
    stop_ts = time.perf_counter()
    print(f"Testing of {s} took {stop_ts - start_ts:0.4f} seconds")

# copied from output
# C:\Python39\python.exe "C:/Users/AFTAB SAMA/PycharmProjects/Python2/Practicals/Lab 12/evil_re.py"
# Testing of aaaa took 0.0004 seconds
# Testing of aaaaaaaa took 0.0001 seconds
# Testing of aaaaaaaaaaaa took 0.0018 seconds
# Testing of aaaaaaaaaaaaaaaa took 0.0339 seconds
# Testing of aaaaaaaaaaaaaaaaaaaa took 0.4914 seconds
# Testing of aaaaaaaaaaaaaaaaaaaaaaaa took 8.0687 seconds
# Testing of aaaaaaaaaaaaaaaaaaaaaaaaaaaaa took 254.5994 seconds
#
# Process finished with exit code 0
