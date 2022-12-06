# 12. python function to print calendar of a month that is passed as an argument.

import calendar

year = int(input("Enter Year: "))

month = int(input("Enter Month: "))

# printing Calendar
print(calendar.month(year, month))

