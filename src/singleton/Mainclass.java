package singleton;

public class Mainclass {
    public static void main(String[] args) {

        SingletonExample se1= SingletonExample.getInstance();
        SingletonExample se2= SingletonExample.getInstance();
        SingletonExample se3=  SingletonExample.getInstance();
        SingletonExample se4= SingletonExample.getInstance();
        System.out.println(se1);
        System.out.println(se2);
        System.out.println(se3);
        System.out.println(se4);


    }
}
