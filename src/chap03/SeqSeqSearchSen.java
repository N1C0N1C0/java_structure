package chap03;

import java.util.Scanner;

public class SeqSeqSearchSen {
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;

        while (true) {
            if(a[i] == key)
                break;
            i++;
        }
        return 1 == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("要素数: ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];

        for(int i = 0; i < num; i++) {
            System.out.print("x["+i+"]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("検索する値：　");
        int ky = sc.nextInt();

        int idx = seqSearch(x, num, ky);

        if(idx == -1)
            System.out.println("その値の要素がありません。");
        else
            System.out.println("その値は x["+idx+"]にあります。");
    }
}

