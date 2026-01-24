package chap01;
import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        int num;

        System.out.print("정수를 입력하세요.: ");
        num = input.nextInt();
        input.nextLine();

        if (num > 0){
            System.out.println("이 수는 양수입니다.");
        } else if (num < 0){
            System.out.println("이 수는 음수입니다.");
        } else {
            System.out.println("이 수는 0입니다.");
        }

    }
}
