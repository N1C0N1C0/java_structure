package chap05;

import java.util.Scanner;

public class EuclidGCD {
    static int gcd(int x, int y) {
        if(y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("二つの整数の最大公約数を求めます。");

        System.out.print("整数を入力してください：　"); int x = sc.nextInt();
        System.out.print("整数を入力してください：　"); int y = sc.nextInt();

        System.out.println("最大公約数は"+ gcd(x,y) + "です。");
    }
}
