package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
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

        public static final Comparator<PhyData> HEIGHT_ORDER =
                new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyData> {
            public int compare(PhyData o1, PhyData o2) {
                return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
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
        System.out.print("背が何cmの人を探しいますか。：　");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(
                x,
                new PhyData("",height,0.0),
                PhyData.HEIGHT_ORDER
        );

        if(idx<0)
            System.out.println("その値の要素がありません。");
        else {
            System.out.println("その値は x["+idx+"]にあります。");
            System.out.println("探すデータ：　"+ x[idx]);
        }
    }
}
