package chap03;

import java.util.Scanner;

public class SeqSeqSearchFor {
    static int seqSearch(int[] a, int n, int key) {
        for(int i = 0; i < n; i++)
            if(a[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("要素数: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("x["+i+"]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("検索する値：　");
        int ky = sc.nextInt();

        int idx = seqSearch(x, num, ky);

        if(idx == 1)
            System.out.println("その値の要素がありません。");
        else
            System.out.println("その値は x["+idx+"]にあります。");

    }
}
