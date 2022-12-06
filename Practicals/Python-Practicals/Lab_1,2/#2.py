# 2. write a programme to compute distance between two points taking inputs from the user
# 24-9-2021

x1 = int(input("Enter x1 = "))
x2 = int(input("Enter x2 = "))
y1 = int(input("Enter y1 = "))
y2 = int(input("Enter y2 = "))

d = ((((x2 - x1)**2) + ((y2 - y1)**2))**0.5)

print("distance between ", (x1, x2), "and", (y1, y2), "is = ", d)
