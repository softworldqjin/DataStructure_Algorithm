package chap01;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("2자리의 양수를 입력하세요.");
            System.out.print("no값: ");
            n = input.nextInt();
        } while (n < 10 || n > 99);

        System.out.println("변수 no값은 " + n + "이 되었습니다.");
    }
}
