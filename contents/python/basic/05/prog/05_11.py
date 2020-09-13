calendar = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

month = int(input("Please input month: "))
for day in range(1, calendar[month - 1] + 1):
    if day % 7 == 0:
        print(day)
    else:
        print(day, end=" ")
