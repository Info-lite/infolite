#include<stdio.h>

int main(){
    char a[1];
    char *p;
    int i = 0;

    scanf("%s", a);

    while(1==1){
        if(a[i]>=97&&a[i]<=122){
            *p = a[i] - 32;
        }else if(a[i]>=65&&a[i]<=90){
            *p = a[i] + 32;
        }
        printf("%c", *p);
        i = i + 1;
        if(a[i]==0){
            break;
        }
    }
    printf("\n");
    return 0;
}
