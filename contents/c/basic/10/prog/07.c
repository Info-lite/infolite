#include <stdio.h>

void max_three(double a, double b, double c){
    double d;
    if(a>=b){
        if(a>=c){
            d=a;
        }
        else{
            d=c;
            }
        }
    else if(b>a){
        if(b>=c){
            d=b;
        }
        else{
            d=c;
        }
    }
    printf("最大は%lfです．\n", d);
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
    max_three(a, b, c);
    return 0;
}
