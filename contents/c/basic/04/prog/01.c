#include <stdio.h>

int main() {
    int x, y , a, b;

    printf("1つ目の値を入力してください。\n");
    scanf("%d",&x);    
    printf("2つ目の値を入力してください。\n");
    scanf("%d",&y);    
    printf("計算方法を指定してください。\n１：足し算　２：引き算　３：掛け算　４：割り算\n");
    scanf("%d",&a);

    if (a == 1){
        b = x + y;
        printf("%d + %d = %d\n", x , y, b);
    } else if(a == 2){
        b = x - y;
        printf("%d - %d = %d\n", x , y, b);
    } else if(a == 3){
        b = x * y;
        printf("%d * %d = %d\n", x , y, b);
    } else if(a == 4){
        b = x / y;
        printf("%d / %d = %d\n", x , y, b);
    } else {
        printf("計算方法には1から4までの数字を入力してください。");
    }

    return 0;
}