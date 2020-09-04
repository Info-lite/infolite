#include <stdio.h>

void five_max(int a, b, c, d, e){
    int f[5]={a,b,c,d,e};
    for(int i=0; i<5;i++){
        if (f[i]>f[i+1]){
            int k;
            k = f[i];
            f[i] = f[i+1];
            f[i+1] = k;
        }
    }
    printf("最小は%dです",f[1]);
}
int main(void){
    int a,b,c,d,e;
    printf("aを入力してください\n");
    scanf("%d",&a);
    printf("bを入力してください\n");
    scanf("%d",&b);
    printf("cを入力してください\n");
    scanf("%d",&c);
    printf("dを入力してください\n");
    scanf("%d",&d);
    printf("eを入力してください\n");
    scanf("%d",&e);
    five_max(a, b, c, d, e);
    return 0;
}
