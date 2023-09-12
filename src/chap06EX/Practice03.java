package chap06EX;

import java.util.Scanner;

public class Practice03 {

    static int change = 0;
    static int count = 0;
    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void bubbleSort(int[] a, int n) {
        int exchange = 0;
        for(int i=0; i<n-1; i++) {
            System.out.printf("pass %d:\n",i+1);
            for(int j=n-1; j>i; j--){
                for(int k=0; k<n-1; k++) {
                    System.out.printf("%2d%2s",a[k], k!=j-1 ? " " : a[j-1] > a[j] ? "+":"-");
                }
                System.out.printf("%2d\n",a[n-1]);
                if(a[j-1] > a[j]) {
                    swap(a, j-1, j);
                    exchange++;
                    change++;
                }
                count++;
            }
            if(exchange==0) break;
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
