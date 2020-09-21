#include <stdio.h>

struct com{
    char name[20];
    char sex[10];
    int age;
    int num;
};

int main(){
    struct com a = {"Takashi Yuu", "man", 32, 1};
    struct com b = {"Suzuki takashi", "man", 18, 3};
    struct com c = {"Tanaka Mari", "woman", 24, 2};

    return 0;
}