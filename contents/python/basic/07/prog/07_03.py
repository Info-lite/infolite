print('値を３つ入力してください。')
A=[0,0,0]
A = [int(input()),int(input()),int(input())]

for j in range(0, len(A) - 1):
    for i in range(0, len(A) - 1):
        if A[i+1] > A[i]:
            A[i], A[i + 1] = A[i + 1], A[i]
print(A)
