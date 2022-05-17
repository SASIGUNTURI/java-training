package stringsexample;

public class Continuereturnbreak {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);


            for (int k = 0; k < 6; k++) {
                if (k == 2)
                    break;
                System.out.println("k :" + k);

            }
        }
    }
}



