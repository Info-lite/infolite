print('値を入力してください。')
x = int(input())
print()
i=1
j=1
while i <= x:
    while j <= i*i:
        print(j,end=' ')
        j+=1
    print()
    i += 1
