package stringbuffers;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("hello where are you ", " ");
        while (st.hasMoreTokens()) {

            System.out.println(st.nextToken());
        }
    }
}
