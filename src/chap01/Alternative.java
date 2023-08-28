package chap01;

import java.util.Scanner;

public class Alternative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+と-を交互にn個出力します。");
        System.out.print("n値：　");
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0)
                System.out.print("+");
            else
                System.out.print("-");
        }
    }
}
