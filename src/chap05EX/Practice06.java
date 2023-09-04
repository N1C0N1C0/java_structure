package chap05EX;

import java.util.Scanner;

public class Practice06 {

        static void recur3(int n) {
            int[] nstk = new int[100];
            int[] sstk = new int[100];
            int ptr = -1;
            int sw = 0;

            while (true) {
                if(n > 0) {
                    ptr++;
                    nstk[ptr] = n;
                    sstk[ptr] = sw;

                    if(sw == 0) {
                        n = n - 1;
                        System.out.println("n=" + n);
                    }else if (sw == 1) {
                        n = n - 2;
                        sw = 0;
                    }
                    continue;
                }
                do {
                    n = nstk[ptr];
                    System.out.println("ptr1="+ptr);
                    sw = sstk[ptr--] + 1;
                    System.out.println("ptr2="+ptr);
                    System.out.println("sw="+sw);
                    System.out.println("n2="+n);

                    if(sw == 2) {
                        System.out.println(n);
                        if(ptr < 0) {
                            System.out.println("hi");
                            return;
                        }
                    }
                }while (sw == 2);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("整数を入力してください：　");
            int x = sc.nextInt();

            recur3(x);
        }
}
