package oops1;

import java.util.*;

public class Abstract {
    public static void main(String[] args) {
        Traingle traingle=new Traingle(10,20 );
        System.out.println("Traingle is"+traingle.area());
        Reactangle reactangle=new Reactangle(15, 25);
        System.out.println("area of rectangle is "+ reactangle.area());


    }
}
