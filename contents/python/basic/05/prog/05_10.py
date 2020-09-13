x = 11
bn = ""

while True:
    if x // 2 == 0:
        bn = str(x % 2) + bn
        print(bn)
        break
    else:
        bn = str(x % 2) + bn
        x //= 2

"""
#2
x = 11
print(bin(x))
"""