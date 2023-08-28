package chap02EX;

import java.util.Arrays;

public class Practice02 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for( int i=0;i<a.length/2;i++){
            System.out.println(Arrays.toString(a));
            swap(a,i,a.length-i-1);
            System.out.println("a["+i+"]とa["+(a.length-i-1)+"]を交換します。");
        }

    }

    public static void main(String[] args) {
        int[] num = {2,5,1,3,9,6,7};

        reverse(num);

        System.out.println(Arrays.toString(num));
        System.out.println("逆順整列を終えました。");
    }
}
