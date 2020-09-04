#include <stdio.h>


int main() {
    int grade=0;
    printf("数字を入力してください\n");
    scanf("%d", &grade);
    if(90<=grade&&grade<100){
        printf("5\n");
    }
    else if(80<=grade&&grade<90){
        printf("4\n");
    }
    else if(70<=grade&&grade<80){
        printf("3\n");
    }
    else if(60<=grade&&grade<70){
        printf("2\n");
    }
    else{
        printf("1\n");
    }
    return 0;
}
