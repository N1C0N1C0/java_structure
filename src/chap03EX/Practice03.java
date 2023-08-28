package chap03EX;

import java.util.Scanner;

public class Practice03 {
    static int seqSearch(int[] a, int n, int key) {
        int i;
        int k =0;
        int j =0;
        for(i=0; i<n; i++) {
            if(a[i] == key) {
                k++;
            }
        }
        int[] b = new int[k];
        a[n] = key;
        for(i=0; i<n; i++) {
            if(a[i] == key) {
                b[j++] = i;
            }
        }
        return k==0 ? -1 : k;
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
            System.out.println("idxの長いは"+idx+"です。");
    }
}
