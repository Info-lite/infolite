#include<stdio.h>

int main(){
    char a[100];
    char b[100];
    int i = 0;
    int j = 0;
    scanf("%s", a);
    scanf("%s", b);
    
    while(1==1){
        i = i + 1;
        if(a[i]==0){
            break;
        }
    }
    while(1==1){
        a[i] = b[j];
        i = i + 1;
        j = j + 1;
        if(b[j]==0){
            break;
        }
    }
    
    printf("%s\n",a);
    return 0;
}
