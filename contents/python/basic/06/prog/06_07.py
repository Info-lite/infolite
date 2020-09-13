
max = 7
Array = [1] * max

for i in range(0, max - 2):
    Array[i + 2] = Array[i + 1] + Array[i]
print(Array)
