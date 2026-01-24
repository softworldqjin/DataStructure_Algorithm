package chap01;

import java.util.Scanner;

public class SumVerbose2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++){
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.println(n + " = " + (sum + n));
    }
}
