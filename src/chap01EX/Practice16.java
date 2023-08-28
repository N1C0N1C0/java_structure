package chap01EX;

import java.util.Scanner;

public class Practice16 {
    static void spira(int n) {
        int num = 1;
        for(int i=0; i<n; i++) {
            for(int k=n; k>i+1; k--)
                System.out.print(" ");
            for(int j=0; j<=i*2; j++)
                System.out.print(num);
            System.out.println();
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("何段三角形ですか？：　");
        int n = sc.nextInt();

        spira(n);
    }
}
