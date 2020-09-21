#include <stdio.h>

struct uni{
    char name[20];
    int num;
    char sex[10];
};

int main(){
    struct uni a = {"Yamada Taro", 8020392, "man"};
    struct uni b = {"Sugiyama Hanako", 2940232, "woman"};

    return 0;
}