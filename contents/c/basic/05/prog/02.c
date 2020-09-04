#include <stdio.h>
int main()
{
    int i, number ,flag = 0;

    printf("値を入力してください\n");
    scanf("%d", &number);

    for(i=2;i<number;++i) {
        if(number%i==0) {
            flag = 1;
            break;
        }
    }
    if(flag==0){
        printf("%d は素数です。\n", number);
    }
    else{
        printf("%d は素数ではありません。\n", number);
    }
    return 0;
}
