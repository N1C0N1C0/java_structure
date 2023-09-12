package chap06;

import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n)  {
        for(int i=0; i<n-1; i++)
            for(int j= n-1; j>i; j--)
                if(a[j-1] > a[j])
                    swap(a, j-1, j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("バブルソート（バージョン1)");
        System.out.print("要素数：　");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++) {
            System.out.print("x["+ i + "]: ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("昇順に並びます。");
        for(int i=0; i<nx; i++)
            System.out.println("x[" + i +"]= " + x[i]);
    }
}
