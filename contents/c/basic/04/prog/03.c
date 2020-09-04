#include <stdio.h>
#include <stdlib.h>

int main() {
    printf("数字を入力してください\n");
    int a;
    scanf("%d",&a);
    printf("|%d| = %d\n", a, abs(a));
    printf("|%d| = %d\n", -a, abs(a));
    return 0;
}
