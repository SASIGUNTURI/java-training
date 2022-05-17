package oops1;

public class Traingle extends Shape{
    private int base;
    private int height;
    public Traingle(int base,int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (0.5)*base*height;

    }
}

