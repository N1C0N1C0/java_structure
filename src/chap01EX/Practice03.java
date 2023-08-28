package chap01EX;

public class Practice03 {
    static int min3(int a, int b, int c, int d) {
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        if(min > d) min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min3의 최솟값은? (1,3,5,7) = " + min3(1,3,5,7));
        System.out.println("min3의 최솟값은? (7,5,3,1) = " + min3(7,5,3,1));
    }
}
