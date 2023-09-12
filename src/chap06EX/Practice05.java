package chap06EX;

import java.util.Scanner;

public class Practice05 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n)  {
        int left = 0;
        int right = n - 1;
        int last = right;

        while (left < right){
            for (int j = right; j > left; j--){
                if (a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            left = last;

            for (int j = left; j < right; j++){
                if (a[j] > a[j + 1]){
                    swap(a, j, j + 1);
                    last = j;
                }
            }
            right = last;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("両方バブルの整列");
        System.out.print("要素数 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, n);

        System.out.println("昇順に整列しました。");
        for (int i = 0; i < n; i++)
            System.out.println("x[" + i + "]＝" + x[i]);
    }
}
