package chap01;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1からnまでの和を求めます。");

        do {
            System.out.print("nの値：　");
            n = sc.nextInt();
        }while(n <= 0);


        int sum = 0;

        for(int i=0; i <= n; i++)
            sum += i;

        System.out.println("1から　" + n + "までの　値は　" + sum + "です。");
    }
}
