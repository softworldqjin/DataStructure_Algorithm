package ex2;
import java.util.Scanner;
public class Retro {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int min = input.nextInt();

        int result = hour * 60 + min - 45;

        if (result < 0){
            result = 24 * 60 - result;
        }

        System.out.println((result / 60) + " " + (result % 60));
    }
}
