#include <stdio.h>

struct mobile{
    int model;    //機種
    int color;    //色
    int line;    //回線の種類
};

int main(){
    struct mobile a = {1, 0, 3};
    struct mobile b = {2, 0, 1};
    struct mobile c = {3, 1, 4};

    return 0;
}