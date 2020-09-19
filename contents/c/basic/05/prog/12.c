#include <stdio.h>
#include <math.h>

int main()
{
    int i, n , f = 0;

    for(i=1; i<=100; i++) {
        n = sqrt(i);
        f = pow(i, 1/3);
        if(n * n == i){
            printf("");
        }else if(f * f * f == i){
            printf("");
        }else{
            printf("%d\n",i);
        }
            
    }

    return 0;
}