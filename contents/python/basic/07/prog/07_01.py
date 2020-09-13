import math
print('２次方程式 ax^2+bx+c=0 を解きます。\na,b,cの値を入力してください。')
a = int(input("a = "))
b = int(input("b = "))
c = int(input("c = "))
D = math.sqrt(b**2-4*a*c)
x_1 = (-b + D) / (2 * a)
x_2 = (-b - D) / (2 * a)
if x_1 != x_2:
    print('解は、'+ str(x_1) + 'と' + str(x_2) + 'です。')
else:
    print('解は、' + str(x_1) + 'です。')
