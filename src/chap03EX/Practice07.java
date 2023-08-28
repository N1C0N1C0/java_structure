package chap03EX;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Practice07 {
    static class PhyData {
        private String name;
        private int height;
        private double vision;

        public PhyData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyData> VISION_ORDER =
                new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyData> {
            public int compare(PhyData o1, PhyData o2) {
                return Double.compare(o1.vision, o2.vision);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyData[] x = new PhyData[]{
                new PhyData("강민하", 162, 0.3),
                new PhyData("이수연", 168, 0.4),
                new PhyData("황지안", 169, 0.8),
                new PhyData("유서범", 171, 1.5),
                new PhyData("김찬우", 173, 0.7),
                new PhyData("장경오", 174, 1.2),
                new PhyData("박준서", 175, 2.0),
        };
        System.out.print("人の視力を探しいますか。：　");
        double vision = sc.nextDouble();
        int idx = Arrays.binarySearch(
                x,
                new PhyData("",0,vision),
                PhyData.VISION_ORDER
        );

        if(idx<0)
            System.out.println("その値の要素がありません。");
        else {
            System.out.println("その値は x["+idx+"]にあります。");
            System.out.println("探すデータ：　"+ x[idx]);
        }
    }
}
