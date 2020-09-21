#include <stdio.h>

int main() {
    int i;
    int num;
    int a[100];
    int sum = 0;
    double x;
    int y = 0;
    int z = 1;

    printf("テストの受験者数を入力してください。\n");
    scanf("%d",&num);
    printf("点数を入力してください。\n");

    for(i = 0; i<num; i++){
        scanf("%d",&(a[i]));
        sum = sum + a[i];
    }

    x = (double)sum / num;
    printf("平均は%fです。\n", x);
    printf("平均点以上は、");

    for(i = 0; i<num; i++){
        if(a[i] >= x){
            y = y + 1;
        }
    }

    for(i = 0; i<num; i++){
        if(a[i] >= x && y>z){
            z = z + 1;
            printf("%d点、", a[i]);
        }else if(a[i] >= x && y==z){
            printf("%d点", a[i]);
        }
    }
    
    printf("の%d人です。\n",y);
    return 0;
}
