package chap01EX;

public class Practice02 {
    static int min3(int a, int b, int c) {
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min3의 최솟값은? (1,3,5) = " + min3(1,3,5));
        System.out.println("min3의 최솟값은? (5,3,1) = " + min3(5,3,1));
    }
}
