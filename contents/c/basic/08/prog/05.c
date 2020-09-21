#include <stdio.h>

struct hamburger{
    int buns;    //バンズの種類
    int tomato;    //トマトの有無
    int beef;    //肉の種類
    int taste;    //ソースの味
    int cheese;    //チーズの有無
};

int main(){
    struct hamburger a = {1, 0, 3, 2, 1};
    struct hamburger b = {2, 0, 1, 1, 0};
    struct hamburger c = {3, 1, 4, 0, 1};

    return 0;
}