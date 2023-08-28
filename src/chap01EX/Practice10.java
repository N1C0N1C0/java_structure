package chap01EX;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("数字を入力: ");
        int num = sc.nextInt();
        int i = 0;

        while(num>0) {
            num/=10;
            i++;
        }

        System.out.println("その数は　" + i + "桁です。");
    }
}
