package chap01EX;

import java.util.Scanner;

public class Practice15 {
    static void spira(int n) {
        for(int i=0; i<n; i++) {
            for(int k=n; k>i+1; k--)
                System.out.print(" ");
            for(int j=0; j<=i*2; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("何段三角形ですか？：　");
        int n = sc.nextInt();

        spira(n);
    }
}
