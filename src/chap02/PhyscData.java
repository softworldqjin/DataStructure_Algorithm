package chap02;

public class PhyscData {
    String name;
    int height;
    double vision;

    public static final int VMAX = 21;

    public PhyscData(String name, int height, double vision){
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    public static double aveHeight(PhyscData[] dat){
        double sum = 0;

        for (int i = 0; i < dat.length; i++){
            sum += dat[i].height;
        }
        return sum / (double)dat.length;
    }
    public static void distVision(PhyscData[] dat, int[] dist){
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length; i++){
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX /10.0){
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }
}
