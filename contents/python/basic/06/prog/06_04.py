import sys

print('テストの受験者数を入力してください。')
x0 = input()
x = int(x0)

a = []
sum = 0
z=0
print('点数を入力してください。')
for i in range(x):
    y0 = input()
    y = int(y0)
    a.append(y)

for j in range(x):
    sum += a[j]

print('平均は'+str(sum/x)+'点です。\n平均点以上は', end='')

for k in range(x):
    if a[k] >= sum/x:
        print('、' + str(a[k]) + '点', end='')
        z += 1
print('の' + str(z) + '人です。')