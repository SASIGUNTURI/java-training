package stringbuffers;

public class StringBufferProgram {
    public static void main(String[] args) {

        StringBuffer s= new StringBuffer("Power Star pawan Kalyan");
        int p = s.length();
        int q =s.capacity();
//        s.reverse();
        s.deleteCharAt(12);
        System.out.println(s);
//        System.out.println(s);
        System.out.println("length of the String "+ p);
        System.out.println("Capacity of the String " +q);
    }
}
