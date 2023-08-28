package chap03;

import java.util.Scanner;

public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if(a[pc] == key)
                return pc;
            else if(a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        }while(pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("要素数：　");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("昇順に入力してください。");

        System.out.print("x[0]: ");
        x[0] = sc.nextInt();

        for(int i=1; i<num; i++) {
            do {
                System.out.print("x["+i+"]: ");
                x[i] = sc.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("検索する値：　");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky);

        if(idx == -1)
            System.out.println("その値の要素がありません。");
        else
            System.out.println("その値は x["+idx+"]にあります。");
    }
}
