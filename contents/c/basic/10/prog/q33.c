#include <stdio.h>

void min_three(double a, double b, double c){
    double d;
    if(a>=b){
        if(b>=c){
            d=c;
        }
        else{
            d=b;
        }
    }
    else if(b>a){
        if(a>=c){
            d=c;
        }
        else{
            d=a;
        }
    }
    printf("最小は%lfです．\n", d);
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
    min_three(a, b, c);
    return 0;
}
