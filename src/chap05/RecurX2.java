package chap05;

import chap04.IntStack;

import java.util.Scanner;

public class RecurX2 {
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if(n > 0) {
                s.push(n);
                n -= 1;
                continue;
            }
            if(s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n -= 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数を入力してください：　");
        int x = sc.nextInt();

        recur(x);
    }
}
