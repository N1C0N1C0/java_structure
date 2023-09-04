package chap05EX;

import java.util.Scanner;

public class Practice07 {
    static int count = 0;
    static String[] name = {"A柱", "B柱","C柱"};

    static void move(int no, int x, int y) {
        if(no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.println("円盤["+ no +"]を"+ name[x - 1] +"から"+ name[y - 1] + "柱に移す");

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
