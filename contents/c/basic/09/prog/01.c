#include<stdio.h>

int main(){
    int a[] = {5, 2, 8, 56};
    int *p;
    int i;

    for(i=0; i<4; i++){ 
        p = &(a[i]);
        printf("%d\n",*p);
    }
    return 0;
}