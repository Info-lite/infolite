#include<stdio.h>

int main(){
    char a[100];
    char b;
    char *p;
    int i;
    scanf("%s", a);

    for(i=0; i<100; i++){
        p = &(a[i]);
        if(a[i]==0){
            break;
        }
        b = *p;
        a[i] = b - 32;
        printf("%s\n",a);
    }
    return 0;
}
