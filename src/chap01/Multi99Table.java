package chap01;

public class Multi99Table {
    public static void main(String[] args){
        System.out.println("----- 구구단 곱셈표 -----");

        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.printf("%3d", i*j);
            }
            // Sting.format(" ", )
            // printf("서식문자열", i*j) %-d 이면 왼쪽정렬, +이거나 없으면 오른쪽정렬
            // print(i*j)
            System.out.println();
        }
    }
}
