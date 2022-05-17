package stringsexample;

class StringsExample1 {
    public static void main(String[] args) {
        int vCount = 0, cCount = 0;
        String s = "POWER STAR PAWAN KALYAN";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == 'P') {

                count++;
            }
        }
//
//            System.out.println(count);
//        s = s.toLowerCase();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
//                vCount++;
//            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
//                cCount++;
//            }
//        }
//            System.out.println("number of vowels:" + vCount);
//            System.out.println("number of consonents :" + cCount);

        }
    }
