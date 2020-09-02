#include <stdio.h>
#include <math.h>

int main(void) {
    int squares[10];
    int cubes[10];

    for (int i = 0; i < 10; i++) {
        squares[i] = pow(i+1,2);
        cubes[i] = pow(i+1,3);
    }

    for (int i = 1; i <= 100; i++) {
        for (int j = 0; j < 10; j++) {
            if(squares[j] == i || cubes[j] == i) {
                break;
            }
            if(j == 9){
                printf("%d,",i);
            }
        }
    }
    printf("\n");

    return 0;
}
