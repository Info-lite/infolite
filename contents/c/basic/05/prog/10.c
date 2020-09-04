#include <stdio.h>

int main() {
    int i;
    for(int y = 1; y<11; y++){
        i = 0;
        while(i<y){
            printf("*");
            i = i + 1;
            }
            printf("\n");
        }
        printf("\n");
    return 0;
}
