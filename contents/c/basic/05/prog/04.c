#include <stdio.h>

int main() {
    for(int x = 1; x < 10; x++){
        for(int y = 1; y<10; y++){
            int a = x * y;
            printf("%d ",a);
        }
        printf("\n");
    }
    return 0;
}
