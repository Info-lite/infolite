import sys
print('１つめの値を入力してください。 ')
a0 = input()
a = int(a0)
print('２つめの値を入力してください。 ')
b0  = input()
b = int(b0)

if  a > b:
    print(a0 + 'のほうが大きいです。')

elif a < b:
    print(b0 + 'のほうが大きいです。')

elif a == b:
    print('２つの数は等しいです。')
