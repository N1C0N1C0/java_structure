package chap05;

import java.util.Arrays;
import java.util.Scanner;


public class RecurMemo {
    static String[] memo;
    static void recur(int n) {
        if(memo[n+1] != null)
            System.out.println(memo[n+1]);
        else {
            if(n>0) {
                recur(n-1);
                System.out.println(n);
                recur(n-2);
                memo[n+1] = memo[n] + n + "\n";
            }else {
                memo[n + 1] = "";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数を入力してください：　");
        int x = sc.nextInt();

        memo = new String[x + 2];
        recur(x);
        System.out.println(memo.length);
        System.out.println(Arrays.stream(memo).toList());
    }
}
