#include <stdio.h>

void ave_a(int x[], int a){
    int c;
    for(int i = 0;i<a;i++){
        c = c + x[i];
    }
    float d = c/a;
    printf("%f\n", d);
}
int main(void){
    int a;
    printf("いくつ数字を入力ししますか？\n");
    scanf("%d",&a);
    int x[a];
    for(int i=0; i<a;i++){
        printf("%dつ目の数字を入力してください\n",i+1);
        scanf("%d",&x[i]);
    }
    ave_a(x,a);
    return 0;
}

