#include<stdio.h>

int main(){
    int x;
    int *p;
    scanf("%d", &x);
    
    *p = x + 1;
    
    printf("%d\n", *p);
    return 0;
}
