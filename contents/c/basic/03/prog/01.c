#include <stdio.h>

void main() {
    int x;
    int y;
    int ans; 
    int answer;

    printf("1つ目の値を入力してください。\n");
    scanf("%d", &x);
    printf("2つ目の値を入力してください。\n");
    scanf("%d", &y);

    ans = x + y;
    printf("%d + %d = %d\n", x, y, ans);
    ans = x - y;
    printf("%d - %d = %d\n", x, y, ans);
    ans = x * y;
    printf("%d * %d = %d\n", x, y, ans);
    ans = x / y;
    answer = x % y;
    printf("%d / %d = %d あまり %d\n", x, y, ans, answer);
}