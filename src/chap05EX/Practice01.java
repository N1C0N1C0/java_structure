package chap05EX;

import java.util.Scanner;

public class Practice01 {
    static int factorial(int n) {
        int x = 1;
        for(int i=1; i<=n; i++)
            x*=i;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数を入力してください：　");
        int x = sc.nextInt();

        System.out.println(x + "のファクトリアルは" + factorial(x) + "です。");
    }
}
