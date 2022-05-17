package scanner;

import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        Boolean bl  = sc.hasNextShort();
        //boolean po = sc.nextBoolean();

        System.out.println("this is nextLine is " + bl );
    }
}
