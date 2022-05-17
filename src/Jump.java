package javatraining.sample;
public class Jump {
    public static void main(String[] args) {
        for (int i = 10; i < 26; i++) {
            // if the number is even
            // skip and  continue
            if (i % 2 ==0)
                continue;
            // if the number is odd, print it
            System.out.println(i + " ");

        }
    }
}
