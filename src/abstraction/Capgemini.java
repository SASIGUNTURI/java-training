package abstraction;

public class Capgemini extends AbstractionExample {
    private String welcomekit;

    public String getWelcomekit() {
        return welcomekit;
    }
    public void setWelcomekit(String welcomekit) {
        this.welcomekit = welcomekit;
    }

    @Override
    public Long salary() {
        return 50000L;
    }
}
