#include <stdio.h>

int main(void)
{
    int f0, f1, f2;
    f0 = 0;
    f1 = 1;
    printf("%d\n", f0);
    while(f1<10000) {
        printf("%d\n", f1);
        f2 = f1 + f0;
        f0 = f1;
        f1 = f2;
    }
    return 0;
}
