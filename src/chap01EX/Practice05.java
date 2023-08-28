package chap01EX;

public class Practice05 {
    static int med3(int a, int b, int c) {
        if((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }

    // きれいに見えるけど反復されるコードが多い

}
