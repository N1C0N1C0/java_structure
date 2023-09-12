package chap05;

import java.util.Scanner;

public class Hanoi {
    static int count = 0;

    static void move(int no, int x, int y) {
        if(no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.printf("円盤[%d]を%d番柱から%d番柱に移す\n", no, x, y);

        if(no > 1)
            move(no - 1, 6 - x - y, y);

        count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ハノイの塔");
        System.out.print("円盤の個数：　");
        int n = sc.nextInt();

        move(n, 1, 3);
        System.out.println(count);
    }
}
