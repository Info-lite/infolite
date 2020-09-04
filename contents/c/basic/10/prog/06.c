#include <stdio.h>

void three_sum(double a, double b, double c){
    double d;
    d = (a + b + c)/3;
    printf("和は%lfです．\n", d);
}
int main(void){
    double a;
    double b;
    double c;
    printf("aを入力してください\n");
    scanf("%lf",&a);
    printf("bを入力してください\n");
    scanf("%lf",&b);
    printf("cを入力してください\n");
    scanf("%lf",&c);
    three_sum(a, b, c);
    return 0;
}
