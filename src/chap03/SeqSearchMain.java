package chap03;
import java.util.Scanner;
import static chap03.SeqSearch.linearSearch;

public class SeqSearchMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("요솟수: ");
        int count = input.nextInt();

        int[] x = new int[count];

        for (int i = 0; i < count; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = input.nextInt();
        }

        System.out.print("검색할 값: ");
        int search = input.nextInt();

        int index = linearSearch(x, count, search);

        if (index == -1){
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + index + "]에 있습니다.");
        }
    }
}
