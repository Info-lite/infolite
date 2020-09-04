#include <stdio.h>

int main() {
    int thisyear=0;
    printf("いま，西暦何年ですか\n");
    scanf("%d",&thisyear);
    if(2019 <= thisyear){
        int a=(thisyear-2019)%12;
        if(a==0){
            printf("今年の干支は亥．来年は子\n");
        }
        if(a==1){
            printf("今年の干支は子．来年は丑\n");
        }
        if(a==2){
            printf("今年の干支は丑．来年は寅\n");
        }
        if(a==3){
            printf("今年の干支は寅．来年は卯\n");
        }
        if(a==4){
            printf("今年の干支は卯．来年は辰\n");
        }
        if(a==5){
            printf("今年の干支は辰．来年は巳\n");
        }
        if(a==6){
            printf("今年の干支は巳．来年は午\n");
        }
        if(a==7){
            printf("今年の干支は午．来年は未\n");
        }
        if(a==8){
            printf("今年の干支は未．来年は申\n");
        }
        if(a==9){
            printf("今年の干支は申．来年は酉\n");
        }
        if(a==10){
            printf("今年の干支は酉．来年は戌\n");
        }
        if(a==11){
            printf("今年の干支は戌．来年は亥\n");
        }
    }else{
        int b=(2019-thisyear)%12;
        if(b==0){
            printf("今年の干支は亥．来年は子\n");
        }
        if(b==11){
            printf("今年の干支は子．来年は丑\n");
        }
        if(b==10){
            printf("今年の干支は丑．来年は寅\n");
        }
        if(b==9){
            printf("今年の干支は寅．来年は卯\n");
        }
        if(b==8){
            printf("今年の干支は卯．来年は辰\n");
        }
        if(b==7){
            printf("今年の干支は辰．来年は巳\n");
        }
        if(b==6){
            printf("今年の干支は巳．来年は午\n");
        }
        if(b==5){
            printf("今年の干支は午．来年は未\n");
        }
        if(b==4){
            printf("今年の干支は未．来年は申\n");
        }
        if(b==3){
            printf("今年の干支は申．来年は酉\n");
        }
        if(b==2){
            printf("今年の干支は酉．来年は戌\n");
        }
        if(b==1){
            printf("今年の干支は戌．来年は亥\n");
        }
    }
    return 0;
}
