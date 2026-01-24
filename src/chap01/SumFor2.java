package chap01;
import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args){
        System.out.println("1부터 n까지의 합을 구합니다.");
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            System.out.print("n값: ");
            n = input.nextInt();
        } while (n <= 0);

        for (int i = 1; i < n + 1; i++){
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
