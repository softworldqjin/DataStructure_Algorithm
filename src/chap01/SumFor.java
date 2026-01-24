package chap01;
import java.util.Scanner;

public class SumFor {
    public static void main(String[] args){
        System.out.println("1부터 n까지의 합을 구합니다.");
        Scanner input = new Scanner(System.in);
        System.out.print("n값: ");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i < n + 1; i++){
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
