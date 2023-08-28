package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] x = {    // 자바에서 사용하는 키워드(알파벳 순)
                "abstract",   "assert",       "boolean",   "break",      "byte",
                "case",       "catch",        "char",      "class",      "const",
                "continue",   "default",      "do",        "double",     "else",
                "enum",       "extends",      "final",     "finally",    "float",
                "for",        "goto",         "if",        "implements", "import",
                "instanceof", "int",          "interface", "long",       "native",
                "new",        "package",      "private",   "protected",  "public",
                "return",     "short",        "static",    "strictfp",   "super",
                "switch",     "synchronized", "this",      "throw",      "throws",
                "transient",  "try",          "void",      "volatile",   "while"
        };

        System.out.print("ご希望のキーワードを入力してください: ");
        String ky = sc.next();

        int idx = Arrays.binarySearch(x,ky);

        if(idx<0)
            System.out.println("該当キーワードがありません。");
        else
            System.out.println("該当キーワードは x["+idx+"]にあります。");
    }
}
