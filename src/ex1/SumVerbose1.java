package ex1;

import java.util.Scanner;

public class SumVerbose1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다");
        System.out.print("n값: ");
        int n = input.nextInt();





        int sum = 0;
        for (int i = 1; i < n+1; i++){
            sum += i;
            if (i <= n-1){
                 System.out.print(i + " + ");
            } else {
                System.out.print(i + " = " + sum);
            }
        }
    }
}
