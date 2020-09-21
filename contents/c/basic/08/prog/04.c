#include <stdio.h>

struct vehicle{
    int num;
    int color;
    int glass;
};

int main(){
    struct vehicle a = {4, 1, 0};
    struct vehicle b = {2, 3, 1};
    struct vehicle c = {4, 2, 0};

    return 0;
}