package chap02EX;

import java.util.Random;

public class Practice01 {
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i=0; i<a.length; i++) {
            if(max < a[i])
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("キーの最大値を求めます。");
        int nPeople = rand.nextInt(6);
        System.out.print("人数：　");

        int[] height = new int[nPeople];

        System.out.println("キーの値は次のとおりです。");
        for(int i=0; i<nPeople; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height["+i+"]: "+height[i]);
        }

        System.out.println("最大値は"+maxOf(height)+"です。");

    }
}
