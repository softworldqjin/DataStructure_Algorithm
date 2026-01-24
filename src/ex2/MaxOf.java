package ex2;

import java.util.Scanner;

public class MaxOf {
    public static void main(String[] args){
        System.out.println("키의 최대값을 구합니다.");
        Scanner input = new Scanner(System.in);

        System.out.print("사람 수:"); // 사람 수:
        int count = input.nextInt();

        int[] height = new int[count]; // 4 입력, height[0], height[1] 2 3
        for (int i = 0; i < 4; i++){
            // height[0]:
            System.out.println("");
            height[i] = input.nextInt();
        }
    }
}
