#include <stdio.h>

int main() {
    int x, y;

    printf("値を入力してください。\n");
    scanf("%d",&x);    

    if (x == 0){
        printf("error\n");
    } else {
        y = 100 / x;
        printf("%dで100を割ると、%dになります。\n", x, y);
    }

    return 0;
}