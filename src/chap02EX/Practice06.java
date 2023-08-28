package chap02EX;

import java.util.Scanner;

public class Practice06 {
    static int card(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print(r+"|");
        System.out.printf("%9d",x);
        do {
            System.out.print("\n +---------");
            System.out.println();
            if(x!=1)
                System.out.print(r+"|");
            else
                System.out.print("  ");
            System.out.printf("%9d",x/r);
            if (x %r != 0)
                System.out.print("  ・・・"+x%r);
            else if (x %r == 0)
                System.out.print("  ・・・0");
            d[digits++] = dchar.charAt(x%r);
            x /= r;
        }while(x != 0);
        System.out.println();

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

    }
}
