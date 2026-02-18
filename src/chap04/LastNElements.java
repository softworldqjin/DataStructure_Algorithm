package chap04;

import java.util.Scanner;

public class LastNElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];
        int count = 0;
        int retry;

        System.out.println("정수를 입력하세요");

        do {
            System.out.printf("%d번째 정수: ", count + 1);
            a[count++ % N] = sc.nextInt();

            System.out.println("계속할까요? (예.1 / 아니오.0): ");
            retry = sc.nextInt();
        } while (retry == 1);

        int i = count - N;
        if (i < 0) i = 0;

        for (; i < count; i++) {
            System.out.printf("%2d번째 정수 = %d" + (i + 1), a[i % N]);
        }
    }
}
