#include <stdio.h>

int main() {
    int x, y ,a;

    printf("1つ目の値を入力してください。\n");
    scanf("%d",&x);    
    printf("2つ目の値を入力してください。\n");
    scanf("%d",&y);
    a = x - y;     

    if (a > 0){
        printf("%dのほうが大きいです。\n", x);
    } else if(a < 0){
        printf("%dのほうが大きいです。\n", y);
    } else {
        printf("2つの数は等しいです。\n");
    }

    return 0;
}