package chap01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1からnまでの和を求めます。");
        System.out.print("nの値：　");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=0; i <= n; i++)
            sum += i;

        System.out.println("1から　" + n + "までの　値は　" + sum + "です。");
    }
}
