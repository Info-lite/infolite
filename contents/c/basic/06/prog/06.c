#include<stdio.h>
void main()
{
    int a[2][2]={1,3,5,11};
    int b[2][2]={2,6,8,10};
    int c[2][2];
    int i,j;
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            printf("%2d ",c[i][j]);
            if(j==1){
                printf("\n");
            }
        }
    }
}
