import sys
grade = int(input("Please input grade: "))

if 100 >= grade >= 90:
    print("5")
elif 90 > grade >= 80:
    print("4")
elif 80 > grade >= 70:
    print("3")
elif 70 > grade >= 60:
    print("2")
else:
    print("1")
