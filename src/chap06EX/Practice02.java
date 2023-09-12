package chap06EX;

import java.util.Scanner;

public class Practice02 {

    static int count = 0;
    static int change = 0;
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void bubbleSort(int[] a, int n) {
        for(int i=0; i<n-1; i++){
            System.out.println("pass " + (i+1) + ":");
            for(int j=n-1; j>i; j--) {
                for(int k=0; k<n-1; k++)
                    System.out.printf("%2d%2s",a[k], (k != j-1) ? " " : (a[j] < a[j-1] ?"+":"-"));
                System.out.printf("%2d\n",a[n-1]);

                count++;
                if(a[j] < a[j-1]) {
                    change++;
                    swap(a, j-1, j);
                }
            }
        }
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

        System.out.println("比較を"+ count + "回しました。");
        System.out.println("交換を"+ change + "回しました。");
    }
}
