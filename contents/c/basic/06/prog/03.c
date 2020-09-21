#include <stdio.h>

int main() {
    int i;
    int num;
    int a[100];
    int x = 1;

    printf("あなた以外は何人ですか。\n");
    scanf("%d",&num);
    printf("あなたの得点を入力してください。\n");
    scanf("%d",&(a[0]));
    printf("他の人の得点を入力してください。\n");

    for(i = 1; i<(num+1); i++){
        scanf("%d",&(a[i]));
        if(a[i] > a[0]){
            x = x + 1;
        }
    }

    printf("あなたは第%d位です。\n", x);
    return 0;
}
