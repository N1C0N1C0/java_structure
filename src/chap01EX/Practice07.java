package chap01EX;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nまでの定数を入力：　");
        int n = sc.nextInt();

        int num = (1+n) * (n/2) + (n%2==0?0:n/2+1);

        System.out.println("1~"+n+"　＝　"+num);
    }
}
