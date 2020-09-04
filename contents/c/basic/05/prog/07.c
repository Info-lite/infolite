#include <stdio.h>

int main() {
    int n;
    printf("数字を入力してください\n");
    scanf("%d", &n);
    for(int i = 0;i < 100; i++){
        if(n%2==0){
            n = n / 2;
        }
        else{
            n = n * 3 + 1;
        }
        printf("%d,",n);
    }
    return 0;
}
