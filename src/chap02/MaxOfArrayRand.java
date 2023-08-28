package chap02;


import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i=0; i<a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("キーの最大値を求めます。");
        System.out.print("人数：　");
        int num = sc.nextInt();

        int[] height = new int[num];

        System.out.println("キーの値は下と同じです。");
        for(int i=0; i<num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height["+i+"]: "+height[i]);
        }

        System.out.println("最大値は"+maxOf(height)+"です。");
    }
}
