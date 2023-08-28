package chap02;

import java.util.Scanner;

public class CardConv {
    static int card(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x%r);
            x /= r;
        }while(x != 0);

        for(int i=0; i<digits/2; i++) {
            char t = d[i];
            d[i] = d[digits -i -1];
            d[digits -i -1] = t;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10進数を基数に変換します。");
        do {
            do {
                System.out.print("変換するマイナスでない整数: ");
                no = sc.nextInt();
            }while(no < 0);

            do {
                System.out.print("どんな進数で変換しましょうか。(2~36): ");
                cd = sc.nextInt();
            }while(cd < 2 || cd > 36);

            dno = card(no, cd, cno);

            System.out.print(cd + "進数で");
            for(int i=0; i<dno; i++)
                System.out.print(cno[i]);
            System.out.println("です");

            System.out.print("もう一度しましょうか。(1...はい/0...いいえ): ");
            retry = sc.nextInt();
        }while(retry==1);
    }
}
