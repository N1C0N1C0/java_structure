package chap04EX;

import chap04.IntStack;

import java.util.Scanner;

public class Practice03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice03 s = new Practice03(64);

        while(true) {
            System.out.println();
            System.out.printf("現在のデータ数：　A : %d / B : %d\n",
                    s.size(Practice03.AorB.StackA),s.size(Practice03.AorB.StackB));
            System.out.print("( 1) A プッシュ ( 2) A ポップ ( 3) A ピーク " + "( 4) A ダンプ ( 5) A 検索 ( 6) A クリア\n" +
                    "( 7) B プッシュ ( 8) B ポップ ( 9) B ピーク " + "(10) B ダンプ (11) B 検索 (12) B クリア\n" +
                    "(13)   出力 ( 0) 終了 : ");

            int menu = sc.nextInt();
            if(menu==0) break;

            int n, x = 0;
            switch (menu) {
                case 1 :
                    System.out.print("データ：　");
                    x = sc.nextInt();
                    try {
                        s.push(Practice03.AorB.StackA, x);
                    }catch (Practice03.OverflowDoubleHeadIntStackException e) {
                        System.out.println("スタックがいっぱいです。");
                    }
                    break;

                case 2 :
                    try {
                        x = s.pop(Practice03.AorB.StackA);
                        System.out.println("ポップしたデータは"+x+"です。");
                    }catch (Practice03.EmptyDoubleHeadIntStackException e) {
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 3 :
                    try {
                        x = s.peek(Practice03.AorB.StackA);
                        System.out.println("ピークしたデータは"+x+"です。");
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 4 :
                    s.dump(Practice03.AorB.StackA);
                    break;

                case 5 :
                    s.clear(Practice03.AorB.StackA);
                    System.out.println("クリアできました。");
                    break;

                case 6 :
                    System.out.print("探す数を入力：　");
                    int y = sc.nextInt();
                    int num = s.indexOf(Practice03.AorB.StackA,y);
                    if(num==-1)
                        System.out.println("この数はありません。");
                    else
                        System.out.println("この数は["+num+"]にあります。");
                case 7 :
                    System.out.print("データ：　");
                    x = sc.nextInt();
                    try {
                        s.push(Practice03.AorB.StackB, x);
                    }catch (Practice03.OverflowDoubleHeadIntStackException e) {
                        System.out.println("スタックがいっぱいです。");
                    }
                    break;

                case 8 :
                    try {
                        x = s.pop(Practice03.AorB.StackB);
                        System.out.println("ポップしたデータは"+x+"です。");
                    }catch (Practice03.EmptyDoubleHeadIntStackException e) {
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 9 :
                    try {
                        x = s.peek(Practice03.AorB.StackB);
                        System.out.println("ピークしたデータは"+x+"です。");
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 10 :
                    s.dump(Practice03.AorB.StackB);
                    break;

                case 11 :
                    s.clear(Practice03.AorB.StackB);
                    System.out.println("クリアできました。");
                    break;

                case 12 :
                    System.out.print("探す数を入力：　");
                    int y1 = sc.nextInt();
                    int num2 = s.indexOf(Practice03.AorB.StackB,y1);
                    if(num2==-1)
                        System.out.println("この数はありません。");
                    else
                        System.out.println("この数は["+num2+"]にあります。");

                case 13 :
                    System.out.println("容量：　"+ s.getCapacity());
                    System.out.println("Aのデータ数：　"+ s.size(Practice03.AorB.StackA));
                    System.out.println("Bのデータ数：　"+ s.size(Practice03.AorB.StackB));
                    System.out.println("Aは空"+(s.isEmpty(Practice03.AorB.StackA) ? "です" : "ではありません。"));
                    System.out.println("Bは空"+(s.isEmpty(Practice03.AorB.StackA) ? "です" : "ではありません。"));
                    System.out.println("いっぱい" + (s.isFull() ? "です。" : "ではありません。"));
            }

        }
    }
}
