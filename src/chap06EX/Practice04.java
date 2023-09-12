package chap06EX;

import java.util.Scanner;

public class Practice04 {
    static int change = 0;
    static int count = 0;
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void bubbleSort(int[] a, int n) {
        int k = 0;
        int page = 1;
        while(k < n-1) {
            System.out.printf("pass %d: \n", page++);
            int last = n - 1;
            for(int j=n-1; j>k; j--){
                for(int i=0; i<n-1; i++) {
                    System.out.printf("%2d%2s",a[i], i != j-1? " " : a[j-1] > a[j] ? "+" : "-");
                }
                System.out.printf("%2d\n",a[n-1]);
                count++;
                if(a[j-1] > a[j]) {
                    swap(a, j-1, j);
                    last = j;
                    change++;
                }
            }
            k = last;
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
