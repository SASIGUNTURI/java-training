package oops2;

class PajeroSport extends Car {
    String color;
   String fuel;
    public PajeroSport(String color, String fuel ) {
        this.color = color;
         this.fuel=fuel;

    }
    String color() {
       return color+fuel ;
    }
}

