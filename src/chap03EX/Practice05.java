package chap03EX;

import java.util.Scanner;

public class Practice05 {
    static int binSearchX(int[] a, int n, int key) {
        int f = 0;
        int l = n - 1;
        int center;

        do {
            center = (f + l) / 2;

            if(a[center] == key) {
                for(; center > f; center--)
                    if(a[center-1] < key)
                        break;
                return center;
            }
            else if (a[center] < key)
                f = center + 1;
            else
                l = center - 1;
        } while (f <= l);

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

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("検索する値：　");
        int ky = sc.nextInt();

        int idx = binSearchX(x, num, ky);

        if (idx == -1)
            System.out.println("その値の要素がありません。");
        else
            System.out.println("その値は x[" + idx + "]にあります。");
    }
}
