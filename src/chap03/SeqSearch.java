package chap03;

public class SeqSearch {
    public static int linearSearch(int[] array, int last, int key){
        int i = 0;
        while (true){
            if (i == last){
                return -1;
            }
            if (array[i] == key){
                return i;
            }
            i++;
        }
    }
}
