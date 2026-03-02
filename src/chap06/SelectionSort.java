package chap06;

import java.util.Arrays;

public class SelectionSort {
    static void swap(int[] a, int pre, int post) {
        int t = a[pre];
        a[pre] = a[post];
        a[post] = t;
    }

    static void selectSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 2, 4};
        selectSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
