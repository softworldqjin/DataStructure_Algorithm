package ex1;

import java.util.Scanner;

public class Median {
    public static void main(String[] args){
        System.out.println("세 정수의 중앙값을 구합니다.");
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("a의 값: ");
        a = input.nextInt();

        System.out.print("b의 값: ");
        b = input.nextInt();

        System.out.print("c의 값: ");
        c = input.nextInt();

        median(a,b,c);

    }
    public static void median(int a, int b, int c){
        int median = 0;

        if (a > b && a < c){
            median = a;
        }

        if (b > a && b < c){
            median = b;
        }

        if (c > a && c < b){
            median = c;
        }
        System.out.println("중앙값은 " + median + "입니다.");
    }
}