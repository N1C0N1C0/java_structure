package chap01;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;

        System.out.println("+をn個出力するが、w個ごとに行を変えて出力します。");

        do {
            System.out.print("n値：　");
            n = sc.nextInt();
        }while(n <= 0);

        do {
            System.out.print("w値：　");
            w = sc.nextInt();
        }while(w <= 0 || w > n);

        for(int i=0; i<n; i++) {
            System.out.print("*");
            if(i%w == w-1)
                System.out.println();
        }

    }
}
