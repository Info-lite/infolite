#include <stdio.h>

void two_sum(int a, int b){
    int c;
    c = a + b;
    printf("%d\n", c);
}
int main(void){
    int a;
    int b;
    printf("aを入力してください\n");
    scanf("%d",&a);
    printf("bを入力してください\n");
    scanf("%d",&b);
    two_sum(a, b);
    return 0;
}

