package chap02;

import java.util.Scanner;

public class MaxOfArray {
    public static void max(int[] height){
        int max = height[0];
        for (int i = 1; i < height.length; i++){
            if (max < height[i]) max = height[i];
        }
        System.out.println("최대값은 " + max + "입니다.");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수: ");
        int n = input.nextInt();

        int[] height = new int[n];
        for (int i = 0; i < height.length; i++){
            System.out.print("height[" + i + "]: ");
            height[i] = input.nextInt();
        }
        max(height);

    }

}
