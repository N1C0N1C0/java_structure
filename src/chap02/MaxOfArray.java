package chap02;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i=0; i<a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("キーの最大値を求めます。");
        System.out.print("人数：　");
        int num = sc.nextInt();

        int[] height = new int[num];

        for (int i=0; i<num; i++) {
            System.out.print("height["+i+"]: ");
            height[i] = sc.nextInt();
        }

        System.out.println("最大値は"+maxOf(height)+"です。");
    }
}
