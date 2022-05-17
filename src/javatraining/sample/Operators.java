package javatraining.sample;

public class Operators{
    public static void main(String[] args){
        // arithematic
        int a=99, b=44;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        // unary
        int n1=-99;
        System.out.println("n1="+(n1));
        //relational
        int e=99, f=44;
        System.out.println(e==f);
        System.out.println(e!=f);
        System.out.println(e>f);
        System.out.println(e<f);
        System.out.println(e<=f);
        System.out.println(e>=f);
        //logical
        int g=12,h=33;
        System.out.println((g > h) &&(g > h));
        System.out.println((g < h) &&(g < h));
        System.out.println((g < h)||(g < h));
        System.out.println((g > h)||(g > h));
        System.out.println(!(g==h));
        System.out.println(!(g>h));
        //assignment
        int num1 =12;
        int var = 12;
        var = num1;
        System.out.println("var using =: " + var);
        //ternary
        int februarydays=29;

        String result;
        result = ( februarydays==28) ? "Not a Leap year" : " Leap year";
        System.out.println(result);

    }
}






