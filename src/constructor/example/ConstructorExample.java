package constructor.example;

public class ConstructorExample {
  
    int id;
    String name;

    ConstructorExample(int id, String name) {
        System.out.println(id +" "+name);

    }
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample(101,"Sai");
        ConstructorExample ce1 = new ConstructorExample(102,"Saikumar");

    }

}

