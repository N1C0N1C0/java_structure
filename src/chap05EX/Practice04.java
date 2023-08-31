package chap05EX;

import java.util.Scanner;

public class Practice04 {
    static void recur2(int n) {
        if (n>0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数を入力してください：　");
        int x = sc.nextInt();

        recur2(x);
    }
}
