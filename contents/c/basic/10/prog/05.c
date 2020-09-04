#include <stdio.h>

void three_sum(int a, int b, int c){
    int d;
    d = a + b + c;
    printf("和は%dです．\n", d);
}
int main(void){
    int a;
    int b;
    int c;
    printf("aを入力してください\n");
    scanf("%d",&a);
    printf("bを入力してください\n");
    scanf("%d",&b);
    printf("cを入力してください\n");
    scanf("%d",&c);
    three_sum(a, b, c);
    return 0;
}

