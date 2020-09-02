#include <stdio.h>
int main() {
    printf("数字を入力してください．\n");
    int a ;
    int sum =1;
    scanf("%d",&a);
    if(a<1){
        printf("整数を入力してください");
        return 0;
    }
    int i = 1;
    while(i<a){
        printf(" %d *",i);
        sum = sum * i;
        i++;
    }
    printf(" %d = %d",a ,sum*a);

    return 0;
}
