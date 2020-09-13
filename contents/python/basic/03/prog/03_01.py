import sys
print('１つめの値を入力してください。')
a0 = input()
a = int(a0)

print('２つめの値を入力してください。')
b0 = input()
b = int(b0)

print(a0 + '+' + b0 + '=' + str(a+b))
print(a0 + '-' + b0 + '=' + str(a-b))
print(a0 + '*' + b0 + '=' + str(a*b))
print(a0 + '/' + b0 + '=' + str(a//b) + 'あまり' + str(a%b))

