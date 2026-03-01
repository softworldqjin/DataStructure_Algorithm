package chap06;

import java.util.Arrays;

public class BubbleSort2 {
    static void swap(int[] a, int pre, int post) {
        int t = a[pre];
        a[pre] = a[post];
        a[post] = t;
    }
    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchange = 0;
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchange++;
                }
            }
            if (exchange == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 6, 2, 4, 7};
        bubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
