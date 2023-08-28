package chap01EX;

import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("正方形を出力しなさい。");
        System.out.print("便の長さ: ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            System.out.println("*".repeat(num));
        }
    }
}
