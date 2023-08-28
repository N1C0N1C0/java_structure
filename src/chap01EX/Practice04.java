package chap01EX;

import java.util.Arrays;

public class Practice04 {
    static int med3(int a, int b, int c) {
        int[] list = {a,b,c};
        Arrays.sort(list);
        return list[list.length/2];
    }

    public static void main(String[] args) {
        System.out.println("med3의 중앙값은? (1,2,3) = "+med3(1,2,3));
    }
}
