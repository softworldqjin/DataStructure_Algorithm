package chap01;
import java.util.Scanner;

public class Max3 {
    public static void main(String[] args){
        System.out.println("세 정수의 최대값을 구합니다.");
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("a의 값: ");
        num1 = input.nextInt();
        input.nextLine();

        System.out.print("b의 값: ");
        num2 = input.nextInt();
        input.nextLine();

        System.out.print("c의 값: ");
        num3 = input.nextInt();

        int max = num1;
        if (max < num2){
            max = num2;
        }
        if (max < num3){
            max = num3;
        }
        System.out.println("최대값은 " + max + "입니다.");
    }
}
