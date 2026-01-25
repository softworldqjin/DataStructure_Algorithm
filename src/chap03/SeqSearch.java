package chap03;

public class SeqSearch {
    public static int linearSearch(int[] array, int last, int key){
        array[last] = key;
        int i = 0;
        while (true){
            if (key == array[i]){
                break;
            }
            i++;
        }
        return (last == i) ? -1 : i;
    }
}

