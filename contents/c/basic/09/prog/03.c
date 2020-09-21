#include<stdio.h>

int main(){
    double a;
    double *p;

    scanf("%lf",&a);
    p = &a;

    printf("%f\n",*p);
    
    return 0;
}