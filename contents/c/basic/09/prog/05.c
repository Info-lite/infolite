#include<stdio.h>

int main(){
    char a[1];
    char *p;
    scanf("%s", a);
    if(a[0]>=97&&a[0]<=122){
        *p = a[0] - 32;
    }
    else if(a[0]>=65&&a[0]<=90){
        *p = a[0] + 32;
    }
    printf("変換した文字列は %cです\n", *p);
    return 0;
}
