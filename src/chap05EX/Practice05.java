package chap05EX;

import java.util.Arrays;
import java.util.Scanner;


public class Practice05 {
    static String[] memo;
    static int count3;
    static int count5;

    static void recur3(int n) {

        if (n>0) {
            recur3(n - 1);
            System.out.println(n);
            recur3(n - 2);
        }
        ++count3;
    }
    static void recur5(int n) {
        if(memo[n+1] != null)
            System.out.print(memo[n+1]);
        else {
            if(n>0) {
                recur5(n-1);
                System.out.println(n);
                recur5(n-2);
                memo[n+1] = memo[n] + n + "\n";
            }else {
                memo[n + 1] = "";
            }
        }
        ++count5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数を入力してください：　");
        int x = sc.nextInt();

        recur3(x);
        System.out.println("count3: "+count3+"\n");

        memo = new String[x + 2];
        recur5(x);
        System.out.println("count5: "+count5);
    }
}
