#include <stdio.h>

int  combi(int, int);

int main() {
    printf("n個の中からm個を選ぶ組み合わせを求めます．\n");
    int n, m;
    printf("nを入力してください\n");
    scanf("%d", &n);
    printf("mを入力してください\n");
    scanf("%d", &m);
    if(n < m){
        printf("不正な入力です\n");
        return 0;
    }
    printf("%d C %d = %d\n", n, m, combi(n, m));
}
int combi(int n, int r) {
    if (r == 0) {
        return 1;
    }

    return (n - r + 1) * combi(n, r - 1) / r;
}