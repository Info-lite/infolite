#include<stdio.h>

int main(){
    int a[10];
    int *p;
    int i;

    for(i=0; i<10; i++){
        scanf("%d",&(a[i]));
    }
    
    for(i=9; i>-1; i--){
        p = &(a[i]);
        printf("%d\n",*p);
    }
    
    return 0;
}
