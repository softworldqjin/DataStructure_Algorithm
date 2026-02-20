package chap05;

import java.util.Scanner;

public class Recur {
    static void recur(int x) {
        if (x > 0) {
            recur(x - 1);
            System.out.println(x);
            recur(x - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num1 = sc.nextInt();

        recur(num1);
    }
}
