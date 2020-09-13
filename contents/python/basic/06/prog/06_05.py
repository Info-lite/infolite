Array = [5, 8, 7, 1, 0, 3, 4, 6, 2, 9]

for j in range(0, len(Array) - 1):
    for i in range(0, len(Array) - 1):
        if Array[i] > Array[i + 1]:
            Array[i], Array[i + 1] = Array[i + 1], Array[i]
print(Array)
