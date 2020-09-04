#include <stdio.h>

void tasu_a(int x[], int a){
    int c = 0;
    for(int i = 0;i<a;i++){
        c = c + x[i];
    }
    printf("%d\n", c);
}
int main(void){
    int a;
    printf("いくつ数字を入力しますか？\n");
    scanf("%d",&a);
    int x[a];
    for(int i=0; i<a;i++){
        printf("%dつ目の数字を入力してください\n",i+1);
        scanf("%d",&x[i]);
    }
    tasu_a(x,a);
    return 0;
}

