#include <stdio.h>

int main() {
    int a[10]={8,5,3,9,1,6,2,4,7};
    for(int i=0; i<10;i++){
        if (a[i]>a[i+1]){
            int k;
            k = a[i];
            a[i] = a[i+1];
            a[i+1] = k;
        }
    }
    for(int i=0;i<10;i++){
        printf("%d",a[i]);
    }
}
