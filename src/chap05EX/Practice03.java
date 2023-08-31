package chap05EX;

import java.util.Scanner;

public class Practice03 {

    static int gcd(int x, int y) {
        if (y==0)
            return x;
        else
            return gcd(y, x%y);
    }
    static int gcdArray(int[] a, int len) {
        int x = 0;

        if(len == 0)
            return a[x];
        else if(len == 1)
            return gcd(a[x], a[++x]);
        else
            return gcd(a[x],gcdArray(a,gcd(++x,len)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("二つの整数の最大公約数を求めます。");

        System.out.print("長さを入力してください：　");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for(int i=0; i<len; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("最大公約数は"+ gcdArray(arr,len) + "です。");
    }
}
