package chap01;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("2桁のプラスを入力しなさい。");

        do {
            System.out.print("no値：　");
            no = sc.nextInt();
        }while(no < 10 || no > 99);

        System.out.println("変数no値は　"+ no + "がなりました。");
    }
}
