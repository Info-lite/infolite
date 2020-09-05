#include <stdio.h>

int main() {
    int x, y, z, a, b, c;

    printf("値を3つ入力してください。\n");
    printf("入力1>>");
    scanf("%d",&x);    
    printf("入力2>>");
    scanf("%d",&y);   
    printf("入力3>>");
    scanf("%d",&z);

    a = x - y;
    b = y - z;
    c = z - x;

    if (a > 0 && b > 0){
        printf("%d, %d , %d\n", x, y, z);
    } else if(a > 0 && c > 0){
        printf("%d, %d , %d\n", z, x, y);
    } else if(b > 0 && c > 0){
        printf("%d, %d , %d\n", y, z, x);
    } else if(a < 0 && b < 0){
        printf("%d, %d , %d\n", z, y, x);
    } else if(a < 0 && c < 0){
        printf("%d, %d , %d\n", y, x, z);
    } else if(b < 0 && c < 0){
        printf("%d, %d , %d\n", x, z, y);
    }

    return 0;
}