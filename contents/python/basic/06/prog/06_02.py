Array = [4, 6, -3, 5, 2]
print(Array)
i = int(input("Please input value1: "))
j = int(input("Please input value2: "))


Array[i], Array[j] = Array[j], Array[i]
print(Array)
