package ex1;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, w;
        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        System.out.print("n값: ");
        n = input.nextInt();

        System.out.print("w값: ");
        w = input.nextInt();
        // n 10 w 2,,, i <

        for (int i = 0; i < n / w; i++){
            System.out.println("*".repeat(w));
        }

        int result = n % w; // 1
        if (result != 0){
            System.out.println("*".repeat(result));
        }
    }
}
