for x in range(1, 101):
    if (x ** (1 / 2)) % 1 == 0 or (x ** (1 / 3)) % 1 == 0:
        pass
    else:
        print(x, end=" ")
"""
# 2
for x in range(1, 101):
    if int(x ** (1 / 2)) == x ** (1 / 2) or x ** (1 / 3) == int(x ** (1 / 3)):
        print(x, end=" ")
"""