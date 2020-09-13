x = int(input("Please input number: "))
result = 1

if x < 1:
    print("Please input number greater than 1")
else:
    for i in range(1, x + 1):
        result *= i
    print(result)
