package methodoverloading.example;
public interface  Maini  {
        default void computer(){

      }
}

class keyboard implements Maini {
      public void computer(){
            System.out.println("keyboard");
      }

}
class alphabet implements Maini{
     public   void computer (){
           System.out.println("alphabet");

       }
}
 class  interface1{

      public static void main(String[] args){

            Maini m =new keyboard();
            Maini m1= new alphabet();
            m.computer();
            m1.computer();
      }}
