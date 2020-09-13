import sys

print('あなた以外は何人ですか。')
x0 = input()
x = int(x0)

a = []
print('あなたの得点を入力してください。')
y0 = input()
y = int(y0)
a.append(y)
print('他の人の得点を入力してください。')
for i in range(x):
    y0 = input()
    y = int(y0)
    a.append(y)

for j in range(x):
    for k in range(x):
        if a[k] > a[k + 1]:
            a[k], a[k + 1] = a[k + 1],a[k]
for l in range(x):
    if a[l]==y:
        print('あなたは第'+ str(l+1) +'位です。')
    else:
        l += 1
