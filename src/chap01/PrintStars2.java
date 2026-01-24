package chap01;
import java.util.Scanner;

public class PrintStars2 {
    public static void main(String[] args){
        System.out.println("*를 n개를 출력하되 w개마다 줄을 바꿔서 출력합니다.");
        Scanner input = new Scanner(System.in);
        System.out.print("n의 값: ");
        int n = input.nextInt();

        System.out.print("w의 값: ");
        int w = input.nextInt();

        for (int i = 0; i < n / w; i++){
            System.out.println("*".repeat(w));
        }

        int rest = n % w;
        if (rest != 0){
            System.out.println("*".repeat(rest));
        }

    }
}
