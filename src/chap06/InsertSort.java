package chap06;

import java.util.Arrays;

public class InsertSort {
    static void insertSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int temp = a[i];

            for (j = i; j > 0 && a[j - 1] > temp; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 2, 7, 4};
        insertSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
