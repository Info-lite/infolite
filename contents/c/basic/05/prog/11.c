
#include <stdio.h>
int main()
{
    int i, number ,frag = 0;

    printf("値を入力してください\n");
    scanf("%d", &number);
        
    if(number==2 || number==4 || number==6 || number==7 || number==9 || number==11 || number==12){
        for(i=1; i<=9; i++) {
            printf("0%d ",i);
            frag = i % 7;
            if(frag==0){
                printf("\n");
            }
        }
        for(i=10; i<=28; i++) {
            printf("%d ",i);
            frag = i % 7;
            if(frag==0){
                printf("\n");
            }
        }
        printf("29 30 31\n");
    }else if(number==1){
        for(i=1; i<=9; i++) {
            printf("0%d ",i);
            frag = i % 7;
            if(frag==0){
                printf("\n");
            }
        }
        for(i=10; i<=28; i++) {
            printf("%d ",i);
            frag = i % 7;
            if(frag==0){
                printf("\n");
            }
        }
    }else if(number==3 || number==5 || number==8 || number==10){
        for(i=1; i<=9; i++) {
            printf("0%d ",i);
            frag = i % 7;
            if(frag==0){
                printf("\n");
            }
        }
        for(i=10; i<=28; i++) {
            printf("%d ",i);
            frag = i % 7;
            if(frag==0){
                printf("\n");
            }
        }
        printf("29 30\n");
    }else{
        printf("error.");
    }

    return 0;
}