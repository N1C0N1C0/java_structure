package chap03;

import java.util.Comparator;

public class X {
    public static final Comparator<T> COMPARATOR = new Comp();

    private static class Comp implements Comparator<T> {
        public int compare(T d1, T d2) {
            // d1が　d2より大きと正の値を返却
            // d1が　d2より小さいと負の値を返却
            // d1が　d2と同じなら　0返却
            return 0;
        }
    }
}
