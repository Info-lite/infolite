
#include <stdio.h>
int main()
{
    int i, number ,flag = 0;

    printf("値を入力してください\n");
    scanf("%d", &number);

    for(i=1; i<=number; i++) {
        flag = flag + i;
    }

    printf("1から%dまでの和は、%dです。\n", number, flag);
    return 0;
}