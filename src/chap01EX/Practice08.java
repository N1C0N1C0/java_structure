package chap01EX;

public class Practice08 {
    static int sumOf(int a, int b){
        int num = 0;
        int max =0;
        int min = 0;

        if(a<b) {
            min = a;
            max = b;
        }
        if(a>b) {
            min = b;
            max = a;
        }

        for(int i=min; i<=max; i++) {
            num += i;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(sumOf(3,5));
        System.out.println(sumOf(6,4));
    }
}
