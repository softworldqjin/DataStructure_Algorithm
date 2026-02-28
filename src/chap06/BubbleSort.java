package chap06;

import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]: ", i);
            a[i] = sc.nextInt();
        }

        bubbleSort(a, n);
        System.out.println("오름차순으로 정렬했음");

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]: %d\n", i, a[i]);
        }
    }
}
