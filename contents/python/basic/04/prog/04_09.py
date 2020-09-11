print('値を３つ入力してください。\n'
      '入力1>>')
a0 = input()
a = int(a0)
print('入力2>>')
b0 = input()
b = int(b0)
print('入力3>>')
c0 = input()
c = int(c0)

if a >= b >= c:
    print('結果>>'+ a0 + ',' + b0 + ',' + c0)
elif a >= c >= b:
    print('結果>>' + a0 + ',' + c0 + ',' + b0)
elif b >= c >= a:
    print('結果>>' + b0 + ',' + c0 + ',' + a0)
elif b >= a >= c:
    print('結果>>' + b0 + ',' + a0 + ',' + c0)
elif c >= b >= a:
    print('結果>>' + c0 + ',' + b0 + ',' + a0)
elif c >= a >= b:
    print('結果>>' + c0 + ',' + a0 + ',' + b0)


