package chap03;

import java.util.Arrays;

public class ArraysbinarySearch {
    public static void main(String[] args){
        // 오름차순으로 배열이 정의되있다 가정하고 이진검색한다,
        // 자료형 모두를 검색할 수 있게, 오버로딩이 되어 있다

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.binarySearch(array, 4));

        String[] array1 = {"가위", "나라", "다리미", "마굿간", "바보", "사랑"};
        System.out.println(Arrays.binarySearch(array1, "나라"));
    }
}
