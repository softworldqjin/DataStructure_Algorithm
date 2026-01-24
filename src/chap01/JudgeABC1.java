package chap01;
import java.util.Scanner;

public class JudgeABC1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while (true){
            int num;
            System.out.print("정수를 입력하세요.: ");
            num = input.nextInt();
            input.nextLine();

            if (num == 1){
                System.out.println("A");
            } else if (num == 2){
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }
}
