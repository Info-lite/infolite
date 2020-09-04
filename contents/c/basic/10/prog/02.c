#include <stdio.h>

void two_ave(int a, int b){
    int c;
    c = (a + b)/2;
    printf("平均は%dです\n", c);
}
int main(void){
    int a;
    int b;
    printf("aを入力してください\n");
    scanf("%d",&a);
    printf("bを入力してください\n");
    scanf("%d",&b);
    two_ave(a, b);
    return 0;
}
