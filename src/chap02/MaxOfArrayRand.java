package chap02;

import java.util.Scanner;
import java.util.Random;

public class MaxOfArrayRand {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random(100);

        System.out.print("사람 수: ");
        int count = input.nextInt();

        int[] height = new int[count];
        for (int i = 0; i < height.length; i++){
            height[i] = random.nextInt(90) + 100;
        }

        System.out.println("킷값은 다음과 같습니다.");
        for (int i = 0; i < height.length; i++){
            System.out.println("height[" + i + "]: " + height[i]);
        }

        System.out.println("최댓값은 " + max(height) + "입니다.");
    }
    static int max(int[] height){
        int max = height[0];

        for (int i = 1; i < height.length; i++){
            if (height[i] > max) max = height[i];
        }
        return max;
    }
}
