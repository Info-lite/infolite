import sys
print('１つめの値を入力してください。 ')
a0 = input()
a = int(a0)
print('２つめの値を入力してください。 ')
b0  = input()
b = int(b0)
print('計算方法を指定してください。 \n'
      '1：足し算　2：引き算　3：掛け算　4：割り算')
c0 = input()
c = int(c0)
if  c == 1:
    print(a0 + '+' + b0 + '=' + str(a+b))

elif c == 2:
    print(a0 + '-' + b0 + '=' + str(a-b))

elif c == 3:
    print(a0 + '×' + b0 + '=' + str(a*b))

elif c == 4:
    print(a0 + '÷' + b0 + '=' + str(a/b))

else:
    print('計算方法には1から4までの数字を入力してください。')

