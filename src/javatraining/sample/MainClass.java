package javatraining.sample;

import abstraction.AbstractionExample;
import abstraction.Capgemini;
import abstraction.TcsCompany;

public class MainClass {
    public static void main(String[] args) {

        AbstractionExample ae = new Capgemini();
        System.out.println(ae.salary());
         ae = new TcsCompany();
        System.out.println(ae.salary());

    }
}
