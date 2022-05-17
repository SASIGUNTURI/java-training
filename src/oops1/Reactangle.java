package oops1;

public class Reactangle extends Shape{
   private  int length;
   private  int breadth;

    Reactangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

   private int getLength(){return length;}
    public void setLength(int length){
       this.length=length;
    }
    public int getBreadth(){return breadth;}
    public void setBreadth(int breadth){this.breadth=breadth;}

    @Override
    public double area() {
        return breadth*length;

    }
}
