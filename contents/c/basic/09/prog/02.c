#include<stdio.h>

int main(){
    int a[] = {5, 2, 8, 56};
    int *p1;
    int *p2;
    int i;
    int x;

    p1 = &(a[1]);
    x = a[2];
    a[2] = *p1;
    a[1] = x;

    for(i=0; i<4; i++){ 
        p1 = &(a[i]);
        printf("%d\n",*p1);
    }
    return 0;
}