package chap01;
import java.util.Scanner;

public class Max3Method {
    public static void main(String[] args){
        int i = max3(3,2,1);
        i = max3(3,2,2);
        i = max3(3,1,2);
        i = max3(3,2,10);
    }

    public static int max3(int n1, int n2, int n3){
        int max = n1;
        if (max < n2){
            max = n2;
        }
        if (max < n3){
            max = n3;
        }
        return max;
    }
}

