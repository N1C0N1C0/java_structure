package chap01EX;

import java.util.Scanner;

public class Practice14 {
    static void triangleLB(int n) {
        for(int i=0; i<n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("何段三角形ですか？: ");
        int n = sc.nextInt();

        triangleLB(n);
    }
}
