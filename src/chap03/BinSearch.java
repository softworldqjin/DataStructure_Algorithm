package chap03;

import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("요솟수: ");
        int num = input.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");
        System.out.print("x[0]: ");
        x[0] = input.nextInt();

        for (int i = 1; i < x.length; i++){
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = input.nextInt();
            } while (x[i-1] > x[i]);
        }

        System.out.print("검색할 값: ");
        int key = input.nextInt();
        int index = binSearch(x, num, key);

        if (index == -1){
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + index + "] 에 있습니다.");
        }
    }
    static int binSearch(int[] array, int end, int key){
        int pl = 0;
        int pr = end - 1;

        do {
            int pc = (pl + pr) / 2;
            if (array[pc] == key){
                return pc;
            } else if (array[pc] > key){
                pr = pc - 1;
            } else {
                pl = pc + 1;
            }
        } while (pl <= pr);
        return -1;
    }
}
