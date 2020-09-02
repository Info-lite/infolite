import sys

print('いくつ入力しますか？')
x0 = input()
x = int(x0)

a = []
for i in range(x):
    print(i+1, '個目のデータを入力してください。')
    y0 = input()
    y = int(y0)
    a.append(y)

for i in range(x):
    print(i+1, '番目のデータは、', a[i], 'です。')


