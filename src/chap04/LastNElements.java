package chap04;

import java.util.Scanner;

public class LastNElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 5;
        int[] a = new int[N];
        int cnt = 0;
        int retry;

        System.out.println("整数を入力しなさい。");

        do {
            System.out.printf("%d番目整数: ", cnt + 1);
            a[cnt++ % N] = sc.nextInt();

            System.out.print("続けましょうか？(1.はい 0.いいえ):");
            retry = sc.nextInt();
        }while (retry == 1);

        int i = cnt - N;
        if(i < 0) i = 0;

        for( ; i<cnt; i++)
            System.out.printf("%2d番目整数 =  %d\n", i+1, a[i%N]);
    }
}
