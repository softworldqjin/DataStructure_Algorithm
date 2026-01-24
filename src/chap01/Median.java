package chap01;
import java.util.Scanner;

public class Median {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값: ");
        a = input.nextInt();
        input.nextLine();
        System.out.print("b의 값: ");
        b = input.nextInt();
        input.nextLine();
        System.out.print("c의 값: ");
        c = input.nextInt();

        System.out.println("중앙값은 " + median(a,b,c) + "입니다.");
    }

    public static int median(int n1, int n2, int n3){
        int med = 0;
        if (n1 >= n2 && n1 <= n2){
            med = n1;
        }
        if (n2 >= n1 && n2 <= n3){
            med = n2;
        }
        if (n3 >= n1 && n3 <= n2){
            med = n3;
        }
        return med;
    }
}
