x = int(input("Please input Natural number: "))

for n in range(1, x):
    if n % 2 == 0:
        print(round(n / 2))
    else:
        print(n * 3 + 1)
