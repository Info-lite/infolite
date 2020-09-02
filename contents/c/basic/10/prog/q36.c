#include<stdio.h>
#include<string.h>

void char_cast(char a[0]){
    if(a[0]>=97&&a[0]<=122){
        a[0] = a[0] - 32;
    }
    else if(a[0]>=65&&a[0]<=90){
        a[0] = a[0] + 32;
        }
    printf("変換した文字列は %s\n です", a);
    }

int main(void){
    char a[1];
    printf("文字列を入力してください = \n");
    scanf("%s", a);
    char_cast(a);
    return 0;
}
