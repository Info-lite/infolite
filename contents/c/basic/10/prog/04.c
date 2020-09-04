#include <stdio.h>

void two_min(int a, int b){
    int c;
    if(a>=b){
        c=b;
    } else{
        c=a;
    }
    printf("小さい方は%dです\n", c);
}
int main(void){
    int a;
    int b;
    printf("aを入力してください\n");
    scanf("%d",&a);
    printf("bを入力してください\n");
    scanf("%d",&b);
    two_min(a, b);
    return 0;
}
