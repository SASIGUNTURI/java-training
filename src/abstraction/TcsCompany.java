package abstraction;

public class TcsCompany extends AbstractionExample{
    private String laptop;

    public String getLaptop() {
        return laptop;
    }
    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }


    @Override
    public Long salary() {
        return 25000L;
    }
}
