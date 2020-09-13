import sys

i=0
j=0
A=[[1,2],[3,4]]
B=[[5,6],[7,8]]
C=[[0,0],[0,0]]
print('A=' + str(A))
print('B='+ str(B))
for i in range(2):
    for j in range(2):
        C[i][j] = A[i][j] + B[i][j]
print('A+B=' + str(C))
