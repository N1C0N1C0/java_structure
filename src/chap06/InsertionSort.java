package chap06;

import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] a, int n) {
        for(int i=1; i<n; i++) {
            int j;
            int tmp = a[i];
            for(j=i; j>0 && a[j-1] > tmp; j--)
                a[j] = a[j-1];
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("単純挿入整列");
        System.out.print("要素数：　");
        int n = sc.nextInt();
        int[] x = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        insertionSort(x, n);

        System.out.println("昇順に整列しました。");
        for(int i=0; i<n; i++)
            System.out.println("x[" + i + "]= " + x[i]);
    }
}
