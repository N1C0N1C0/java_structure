package chap02;

import java.util.Scanner;

public class PhysicalExamination {

    static final int VMAX = 21;

    static class PhyscData {
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for(int i=0; i<dat.length; i++)
            sum += dat[i].height;

        return sum / dat.length;
    }

    static void disiVision(PhyscData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for(i=0; i<dat.length; i++)
            if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision*10)]++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("Kang",126,0.3),
                new PhyscData("Kim",173,0.7),
                new PhyscData("Lee",175,2.0),
                new PhyscData("Woo",171,1.5),
                new PhyscData("Pack",186,0.4),
                new PhyscData("Hwang",174,1.2),
                new PhyscData("Hello",169,0.8),
        };
        int[] vdist = new int[VMAX];

        System.out.println("  身体検事リスト");
        System.out.println("名前      長身       視力");
        System.out.println("---------------------");
        for(int i=0; i<x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n",
                    x[i].name,x[i].height,x[i].vision);

        System.out.printf("\n平均長身: %5.1fcm\n",aveHeight(x));

        disiVision(x,vdist);

        System.out.println("\n視力分布");
        for(int i=0; i<VMAX; i++)
            System.out.printf("%3.1f~: %2d名\n",i / 10.0, vdist[i]);
    }
}
