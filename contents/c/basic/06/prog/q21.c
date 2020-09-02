#include <stdio.h>

int main() {
    int a[10]={2,4,3,7,1,11,74,7,2};
    printf("aの配列は");
    for(int z = 0; z < 10;z++){
        printf("%d ",a[z]);
    }
    printf("\n");
    int i, j, k;
    printf("iを入力してください\n");
    scanf("%d",&i);
    printf("jを入力してください\n");
    scanf("%d",&j);
    k = a[i-1];
    a[i-1] =a[j-1];
    a[j-1] =k;
    printf("入れ替わった後のaの配列は\n");
    for(int w = 0; w < 10;w++){
        printf("%d ",a[w]);
    }

    return 0;
}