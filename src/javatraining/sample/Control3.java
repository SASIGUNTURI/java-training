package javatraining.sample;
public class Control3{
    public static void main (String[]args){
        int num=2;
        String size;
        switch (num) {

            case 1:
                System.out.println("small");
                break;
            case 2:
                System.out.println("medium");
                break;
            case 3:
                System.out.println("large");
                break;
            default:
                System.out.println("default number");
                break;
        }

    }
}
