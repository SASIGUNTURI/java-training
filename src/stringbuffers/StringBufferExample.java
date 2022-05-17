package stringbuffers;

public class StringBufferExample {
    public static void main(String[] args) {
        String s=("Travelling From India To Paris");
        int p=s.length();
        System.out.println("length of the String"+ p);


        StringBuffer sb= new StringBuffer("pawan kalyan");
        sb.append(" power star");
        System.out.println(""+ sb);

        StringBuffer sb1= new StringBuffer("pawan kalyan");
        sb1.replace(0,0,"power star ");
        System.out.println(" "+sb1);


        StringBuffer sb2= new StringBuffer("pawan kalyan");
        sb2.delete (0,5);
        System.out.println(" "+sb2);



    }
}
