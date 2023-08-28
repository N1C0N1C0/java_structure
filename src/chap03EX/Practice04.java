package chap03EX;

import java.util.Scanner;

public class Practice04 {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        System.out.print("  |");
        for(int i=0; i<n; i++)
            System.out.printf("%4d",i);
        System.out.print("\n--+");
        for(int i=0; i<n; i++)
            System.out.print("--");


        do {
            int pc = (pl + pr) / 2;
            System.out.print("\n  |");
            if (pl != pc)
                System.out.printf(String.format("%%%ds<-%%%ds+",
                                (pl * 4) + 1, (pc - pl) * 4),
                        "", "");
            else
                System.out.printf(String.format("%%%ds<-+",   pc * 4 + 1), "");
            if (pc != pr)
                System.out.printf(String.format("%%%ds->\n",
                        (pr - pc) * 4 - 2), "");
            else
                System.out.println("->");
            System.out.printf("\n%2d|",pc);
            for(int i : a)
                System.out.printf("%4d",i);
            if(a[pc] == key)
                return pc;
            else if(a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

        }while(pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("要素数：　");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("昇順に入力してください。");

        System.out.print("x[0]: ");
        x[0] = sc.nextInt();

        for(int i=1; i<num; i++) {
            do {
                System.out.print("x["+i+"]: ");
                x[i] = sc.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("検索する値：　");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky);

        if(idx == -1)
            System.out.println("\nその値の要素がありません。");
        else
            System.out.println("\nその値は x["+idx+"]にあります。");
    }
}
