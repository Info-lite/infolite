#include <stdio.h>

void max_a(int x[], int a){
    for(int i=0; i<a;i++){
        if (x[i]>x[i+1]) {
            int k;
            k = x[i];
            x[i] = x[i + 1];
            x[i + 1] = k;
        }
    }
    int l = x[a];
    printf("最大は%dです",l);
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
    max_a(x,a);
    return 0;
}

