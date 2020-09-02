#include <stdio.h>

void min_b(int x[], int a){
    int i, j, tmp;
    for (i=0; i<a; ++i) {
        for (j = i + 1; j < a; ++j) {
            if (x[i] > x[j]) {
                tmp = x[i];
                x[i] = x[j];
                x[j] = tmp;
            }
        }
    }
    printf("小さい順に");
    for(int j = 0; j < a; j++){
        printf("%d ",x[j]);
    }
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
    min_b(x,a);
    return 0;
}
