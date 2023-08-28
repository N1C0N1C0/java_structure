package chap04EX;

import chap04.IntQueue;

import java.util.Scanner;

public class Practice07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice07 s = new Practice07(10);

        while(true) {
            System.out.println();
            System.out.printf("現在のデータ数：　%d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)一番前でインキュ　(2)一番前のディキュ　(3)一番前でピーク\n" +
                                "(4)最後尾にインキュ　(5)最後尾でディキュ　(6)最後尾でビーク\n" +
                                "(7)ダンプ (8)検索　(0)終了：　");

            int menu = sc.nextInt();
            System.out.println();
            if(menu == 0) break;

            int x;
            switch (menu) {
                case 1 :
                    System.out.print("データ：　");
                    x = sc.nextInt();
                    try {
                        s.enqueueFront(x);
                    }catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("キューがいっぱいです。");
                    }
                    break;

                case 2 :
                    try {
                        x = s.dequeueFront();
                        System.out.println("ディキューしたデータは"+x+"です。");
                    }catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("データが空です。");
                    }
                    break;

                case 3 :
                    try {
                        x = s.peekFront();
                        System.out.println("ピークしたデータは"+ x +"です。");
                    }catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("データが空です。");
                    }
                    break;

                case 4 :
                    System.out.print("データ：　");
                    x = sc.nextInt();
                    try {
                        s.enqueueRear(x);
                    }catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("キューがいっぱいです。");
                    }
                    break;

                case 5 :
                    try {
                        x = s.dequeueRear();
                        System.out.println("ディキューしたデータは"+x+"です。");
                    }catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("データが空です。");
                    }
                    break;

                case 6 :
                    try {
                        x = s.peekRear();
                        System.out.println("ピークしたデータは"+ x +"です。");
                    }catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("データが空です。");
                    }
                    break;

                case 7 :
                    s.dump();
                    break;

                case 8 :
                    System.out.print("探す値を入力してください：　");
                    int se = sc.nextInt();
                    int result = s.indexOf(se);
                    if(result == -1)
                        System.out.println("その値はありません。");
                    else
                        System.out.println("その値は "+ result +" 番目にあります。");
                    break;


                default :
                    System.out.println("1~8番だけ選択しなさい。");

            }
        }
    }
}
