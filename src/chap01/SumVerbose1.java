package chap01;

import java.util.Scanner;

public class SumVerbose1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int num1 = input.nextInt();

        int count = 0;
        int sum = 0;
        for (int i = 0; i < num1; i++){
            if (count == num1 - 1){
                System.out.print((i + 1) + " = ");
            } else {
                System.out.print((i + 1) + " + ");
            }
            count++;
            sum += (i + 1);
        }
        System.out.println(sum);
    }
}
