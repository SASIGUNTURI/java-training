package oops2;

import javax.print.DocFlavor;

class RangeRover extends Car {
    private String color;
    private String fuel;

    public  RangeRover(String color,String fuel){
        this.fuel=fuel;

        this.color=color;
    }

    String color() {
        return color+fuel;

    }
}
