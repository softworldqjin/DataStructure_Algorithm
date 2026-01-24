package chap01;
import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args){
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int i = 1;
        while (n >= i){
            sum += i;
            i++;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
