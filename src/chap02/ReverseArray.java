package chap02;

import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < x.length; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = input.nextInt();
        }
        System.out.println("요소를 역순으로 정렬했습니다.");
        reverse(x);

        // Arrays 를 import해와서
        // Arrays.toString(문자열) -> [1, 2, 3, 4] 반환
        System.out.println("x = " + Arrays.toString(x));
    }
    static void reverse(int[] lst){
        for (int i = 0; i < lst.length / 2; i++){
            int temp = lst[i];
            lst[i] = lst[lst.length - i -1];
            lst[lst.length - i -1] = temp;
        }
    }
}
