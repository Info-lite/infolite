#include <stdio.h>

void sum(int n){
    int sum =0;
    sum = n * ( n + 1 ) / 2;
    printf("合計は%dです．",sum);
}

int main(void){
    int n;
    printf("nはいくつですか？\n");
    scanf("%d",&n);
    sum(n);
    return 0;
}
