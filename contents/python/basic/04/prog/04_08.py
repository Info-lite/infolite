import math
a = int(input("'ax^2+bx+c' Please input a: "))
b = int(input("'ax^2+bx+c' Please input b: "))
c = int(input("'ax^2+bx+c' Please input c: "))

D = (b ** 2 - 4 * a * c) ** (1 / 2)
# D = math.sqrt(b**2-4*a*c)
x_1 = (-b + D) / (2 * a)
x_2 = (-b - D) / (2 * a)

print(x_1, x_2)
