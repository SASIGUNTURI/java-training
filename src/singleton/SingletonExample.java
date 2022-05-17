package singleton;

public class SingletonExample {
    private static SingletonExample singletonExample;
    private SingletonExample() {
        System.out.println("i am inside singleton");
    }
    public static SingletonExample getInstance(){
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
return singletonExample ;
    }
}
