package chap03;

public class A implements Comparable<A>{

    public int compareTo(A c) {
        // thisがc より大きい場合は正の値を返します
        // thisがc より小さい場合は負の値をかえします
        // thisがc と同じなら0 返却
        return 0;
    };

    public boolean equals(Object c) {
        //　thisがc　と同じなら　true 返却
        // thisがc　と同じでなければ false 返却
        return true;
    }
}
