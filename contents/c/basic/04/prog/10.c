#include<stdio.h>
#include<string.h>

int main(void){
    int i;
    char str[100];
    printf("文字列を入力してください = \n");
    scanf("%s", str);
    for(i=0;i<=strlen(str);i++){
        if(str[i]>=97&&str[i]<=122){
            str[i] = str[i] - 32;
        }
        else if(str[i]>=65&&str[i]<=90){
            str[i] = str[i] + 32;
        }
    }
    printf("変換した文字列は %s\n です", str);
    return 0;
}
