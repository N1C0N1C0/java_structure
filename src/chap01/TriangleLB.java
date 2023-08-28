package chap01;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("左下が直角の二等辺三角形を出力しなさい。");

        do {
            System.out.println("何段三角形ですか？: ");
            n = sc.nextInt();
        }while(n <= 0);

        for(int i =1; i<=n; i++) {
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
