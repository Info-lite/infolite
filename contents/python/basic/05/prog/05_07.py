n = int(input("Please input Natural number: "))
m = int(input("Please input Natural number: "))


nn = 1
mm = 1

for i in range(n - m + 1, n + 1):
    nn *= i
for j in range(1, m + 1):
    mm *= j

print(nn // mm)

"""
#2
import math

n = 7
m = 5

ncm = (math.factorial(n) // math.factorial(n - m)) // math.factorial(m)

print(ncm)
"""