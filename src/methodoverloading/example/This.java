package methodoverloading.example;

public class This {
    String book;
    String pages;
    String name;
    This(String book, String pages, String name) {
        this.book = book;
        this.pages = pages;
        this.name = name;
    }
    void Display() {
        System.out.println( book + name + pages);
    }
}
class This2{
    public static void main(String[] args) {
        This t =new This("The Girl In The Red Lipstick" ,"two hundred "," Ajay Pandey");
        This t1=new This("the rich dad and poor dad ", "one thundred", "Robert t.kiyosaki");
        t.Display();
        t1.Display();

    }
}
