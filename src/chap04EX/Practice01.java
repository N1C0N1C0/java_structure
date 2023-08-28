package chap04EX;

import chap04.IntStack;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true) {
            System.out.println();
            System.out.printf("現在のデータ数：　%d / %d\n",s.size(),s.getCapacity());
            System.out.print("(1)プッシュ (2)ポップ (3)ピーク (4)ダンプ (5)クリア (6)値を探す (0)終了：　");

            int menu = sc.nextInt();
            if(menu==0) break;

            int x;
            switch (menu) {
                case 1 :
                    System.out.print("データ：　");
                    x = sc.nextInt();
                    try {
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e) {
                        System.out.println("スタックがいっぱいです。");
                    }
                    break;

                case 2 :
                    try {
                        x = s.pop();
                        System.out.println("ポップしたデータは"+x+"です。");
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 3 :
                    try {
                        x = s.peek();
                        System.out.println("ピークしたデータは"+x+"です。");
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 4 :
                    s.dump();
                    break;

                case 5 :
                    s.clear();
                    System.out.println("クリアできました。");
                    break;

                case 6 :
                    System.out.print("探す数を入力：　");
                    int y = sc.nextInt();
                    int num = s.indexOf(y);
                    if(num==-1)
                        System.out.println("この数はありません。");
                    else
                        System.out.println("この数は["+num+"]にあります。");
            }
        }
    }
}
