package chap04EX;

import chap04.IntQueue;

import java.util.Scanner;

public class Practice06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice06<String> s = new Practice06(6);

        while(true) {
            System.out.println();
            System.out.printf("現在のデータ数：　%d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)インキュー　(2)ディキュー　(3)ピーク　(4)ダンプ　(5)検索　(6)検索２　(0)終了：　");

            int menu = sc.nextInt();
            System.out.println();
            if(menu == 0) break;

            String x;
            switch (menu) {
                case 1 :
                    System.out.print("データ：　");
                    x = sc.next();
                    try {
                        s.enqueue(x);
                    }catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("キューがいっぱいです。");
                    }
                    break;

                case 2 :
                    try {
                        x = s.dequeue();
                        System.out.println("ディキューしたデータは"+x+"です。");
                    }catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("データが空です。");
                    }
                    break;

                case 3 :
                    try {
                        x = s.peek();
                        System.out.println("ピークしたデータは"+ x +"です。");
                    }catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("データが空です。");
                    }
                    break;

                case 4 :
                    s.dump();
                    break;

                case 5 :
                    System.out.print("探す値を入力してください：　");
                    String se = sc.next();
                    int result = s.indexOf(se);
                    if(result == -1)
                        System.out.println("その値はありません。");
                    else
                        System.out.println("その値は "+ result +" 番目にあります。");
                    break;

                case 6 :
                    System.out.print("探す値を入力してください：　");
                    String search = sc.next();
                    int re = s.search(search);
                    System.out.println("戻り値は "+ re + "　です。");
                    break;


                default :
                    System.out.println("1~4番だけ選択しなさい。");

            }
        }
    }
}
