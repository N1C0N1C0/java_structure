package chap05;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if(n > 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数を入力してください：　");
        int x = sc.nextInt();

        System.out.println(x + "のファクトリアルは" + factorial(x) + "です。");
    }
}
