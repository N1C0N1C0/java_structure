package chap01EX;

public class Practice01 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max4의 최댓값은? (1,3,5,7) = " + max4(1,3,5,7));
        System.out.println("max4의 최댓값은? (7,5,3,1) = " + max4(7,5,3,1));
    }
}
