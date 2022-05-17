package methodoverloading.example;

//public class MethodOverRiding extends Horse {
//      public void riding(){
//        System.out.println("horse riding on the road ");
//    }
//
//    public static void main(String[] args) {
//        MethodOverRiding m =new MethodOverRiding();
//        m.riding();
//    }
//}

public class MethodOverRiding {
    public void riding() {
        System.out.println("horse riding");
    }


}
class MethodOverRiding2 extends MethodOverRiding {

    public void riding() {
        System.out.println("bus riding ");

    }


    public static void main(String[] args) {
        MethodOverRiding m = new MethodOverRiding();
        MethodOverRiding2 m2= new MethodOverRiding2();
        m.riding();
        m2.riding();
    }
}
