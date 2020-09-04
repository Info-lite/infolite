#include <stdio.h>

void two_max(int a, int b){
    int c;
    if(a>=b){
        c=a;
    } else{
        c=b;
    }
    printf("大きい方は%dです\n", c);
}
int main(void){
    int a;
    int b;
    printf("aを入力してください\n");
    scanf("%d",&a);
    printf("bを入力してください\n");
    scanf("%d",&b);
    two_max(a, b);
    return 0;
}
