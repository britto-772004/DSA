#include <stdio.h>

int CRT(int a[], int m[], int n, int p) {
    int x = 0;

    for (int i = 0; i < n; i++) {
        int M = p / m[i];
        int y = 0;

        for (int j = 0; j < m[i]; j++) {
            if ((M * j) % m[i] == 1) {
                y = j;
                break;
            }
        }

        x += a[i] * M * y;
    }

    return x % p;
}

int main() {
    int size;
    scanf("%d", &size);

    int a[size], m[size];
    int p = 1;

    for (int i = 0; i < size; i++) {
        scanf("%d", &a[i]);
    }

    for (int i = 0; i < size; i++) {
        scanf("%d", &m[i]);
        p *= m[i];
    }

    int result = CRT(a, m, size, p);
    printf("%d\n", result);

    return 0;
}