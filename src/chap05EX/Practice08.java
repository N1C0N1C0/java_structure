package chap05EX;

import java.util.Scanner;

public class Practice08 {
    static void move(int no, int x, int y) {
        int[] xstk = new int[100];
        int[] ystk = new int[100];
        int[] sstk = new int[100];
        int ptr = 0;
        int sw = 0;

        while(true) {
            if(sw == 0 && no > 1) {
                xstk[ptr] = x;
                ystk[ptr] = y;
                sstk[ptr] = sw;
                ptr++;
                no = no - 1;
                y = 6 - x - y;
                continue;
            }

            System.out.printf("円盤[%d]を%d番柱から%d番柱に移す\n", no, x, y);

            if(sw == 1 && no > 1) {
                xstk[ptr] = x;
                ystk[ptr] = y;
                sstk[ptr] = sw;
                ptr++;
                no = no - 1;
                x = 6 - x - y;
                if(++sw == 2)
                    sw = 0;
                continue;
            }
            do {
                if(ptr-- == 0)
                    return;
                x = xstk[ptr];
                y = ystk[ptr];
                sw = sstk[ptr] + 1;
                no++;
            }while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ハノイの塔");
        System.out.print("円盤の個数：　");
        int n = sc.nextInt();

        move(n, 1, 3);
    }
}
