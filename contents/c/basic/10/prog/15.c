#include <stdio.h>

void min_a(int x[], int a){
    int i, j, tmp;
    for (i=0; i<a; ++i) {
        for (j=i+1; j<a; ++j) {
            if (x[i] > x[j]) {
                tmp =  x[i];
                x[i] = x[j];
                x[j] = tmp;
            }
        }
    }

    int l = x[0];
    printf("最小は%dです",l);
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
    min_a(x,a);
    return 0;
}
