package chap01EX;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.print("a値：　");
        a = sc.nextInt();
        while(true) {
            System.out.print("b値：　");
            b = sc.nextInt();
            if(a<b) break;
            System.out.println("aより大きい値を入力してください。");
        }


        System.out.println("b - a は　"+(b-a)+"です。");
    }
}
