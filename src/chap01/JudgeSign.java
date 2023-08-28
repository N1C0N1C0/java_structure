package chap01;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("定数を入力してください。　：　");
        int n = sc.nextInt();

        if(n > 0)
            System.out.println("この数はプラスです。");
        else if(n < 0)
            System.out.println("この数はマイナスです。");
        else
            System.out.println("この数はゼロです。");
    }
}
