package ex2;

import java.util.Scanner;

public class OperatorPractice {
    public void practice7() {
        Scanner input = new Scanner(System.in);
        System.out.print("주민번호 입력:");
        String no = input.next();
        no = no.replace("-","");
        char[] ch = no.toCharArray();

        if (ch[6] == '1' || ch[6] == '3'){
            System.out.println("남자");
        } else {
            System.out.println("여자");
        }
        System.out.println(ch);
    }

    /*
     * 실습 문제 8
     * 주민 번호를 입력받아 남자인지 여자인지 구분하여 출력하세요.
     */

}
