#include <stdio.h>

void ave(int x[], int a){
    int c = 0;
    for(int i = 0;i<a;i++){
        c = c + x[i];
    }
    float d = c/a;
    printf("%f\n", d);
}
int main(void){
    int a;
    printf("いくつ数字を入力しますか？\n");
    scanf("%d",&a);
    int x[a];
    for(int i=0; i<a;i++){
        printf("%dつ目の数字を入力してください\n",i+1);
        scanf("%d",&x[i]);
    }
    ave(x,a);
    return 0;
}

