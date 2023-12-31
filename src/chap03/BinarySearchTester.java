package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
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
            }while (x[i] < x[i-1]);
        }

        System.out.print("検索する値：　");
        int ky = sc.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if(idx<0)
            System.out.println("その値の要素がありません。");
        else
            System.out.println("その値は　x["+idx+"]にあります。");
    }
}
