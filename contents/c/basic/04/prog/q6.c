#include <stdio.h>
#include <math.h>
int main() {
    float a,b,c,d,ans1,ans2,r,i;
    printf("二次方程式はy=ax^2+Bx+Cです．\n");
    printf("Aを入力してください．\n");
    scanf("%f",&a);
    printf("Bを入力してください．\n");
    scanf("%f",&b);
    printf("Cを入力してください．\n");
    scanf("%f",&c);
    d=b*b-4*a*c;
    if(d==0){
        ans1=(-b+sqrt(d) )/(2*a);
        printf("答えは%fです\n",ans1);
        return 0;
    }
    else if(d>0){
        ans1=(-b+(b*b-(4*a*c)),0.5)/(2*a);
        ans2=-(b+(b*b-(4*a*c)),0.5)/(2*a);
        printf("答えは%fと%fです．",ans1,ans2);
    }
    else{
        r=-b/a;
        i=sqrt(-d)/(2*a);
        printf("答えは: %f+%fi, %f-%fi\n",r,i,r,i);
    }
}