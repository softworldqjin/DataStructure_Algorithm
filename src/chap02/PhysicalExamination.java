package chap02;

import java.util.Scanner;

import static chap02.PhyscData.*;

public class PhysicalExamination {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8)
        };
        int[] vdist = new int[VMAX];

        // %5s 는 오른쪽 정렬
        // %-5s는 왼쪽 정렬
        System.out.println("신체 검사 리스트");
        System.out.println("이름      키       시력");
        System.out.println("----------------------");
        for (int i = 0; i < x.length; i++){
            System.out.printf("%-7s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.println();
        System.out.printf("평균 키: %5.1fcm", aveHeight(x));
        System.out.println();

        distVision(x, vdist);

        System.out.println("시력 분포");
        for(int i = 0; i < vdist.length; i++){
            System.out.printf("%3.1f~: %d명", i/10.0, vdist[i]);
            System.out.println();
        }
    }
}
