package chap03EX;

import java.util.Scanner;

public class Practice02 {
    static int seqSearch(int[] a, int n, int key) {
        int i,k;
        a[n] = key;
        System.out.print("   |");
        for(int j=0; j<=n; j++)
            System.out.printf("%3d",j);
        System.out.print("\n---+");
        for(int j=0; j<=n; j++)
            System.out.print("---");
        for(i=0, k=1; i<n; i++,k++) {
            System.out.print("\n   |");
            System.out.printf("%"+k*3+"s","*");
            System.out.print("\n "+i+" |");
            for(int j : a)
                System.out.printf("%3d",j);
            if(a[i] == key)
                break;
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
            System.out.println("\nその値の要素がありません。");
        else
            System.out.println("\nその値は x["+idx+"]にあります。");
    }
}
