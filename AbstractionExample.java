package abstraction;

public abstract class AbstractionExample {
   private  String bag;
   private  String lunchbox;
   private  Integer  pens;

   public  abstract Long salary();

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    public String getLunchbox() {
        return lunchbox;
    }

    public void setLunchbox(String lunchbox) {
        this.lunchbox = lunchbox;
    }

    public Integer getPens() {
        return pens;
    }

    public void setPens(Integer pens) {
        this.pens = pens;
    }
}
