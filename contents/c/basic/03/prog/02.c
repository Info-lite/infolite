#include <stdio.h>

void main() {
    int x;
    int y;
    double ans; 

    printf("三角形の底辺と高さの値を入力してください。\n");
    scanf("%d", &x);
    scanf("%d", &y);

    ans = (double)(x * y) / 2;
    printf("三角形の面積は、%lfです。\n", ans);
}