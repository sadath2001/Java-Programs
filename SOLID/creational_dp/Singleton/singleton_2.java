package creational_dp.Singleton;
//eager initializaion when jvm is loaded then only the object is created
public class singleton_2 {
    private static final singleton_2 instance = new singleton_2();

    private singleton_2() {
        System.out.println("Constructor called");
    }
    public static singleton_2 getInstance() {
        return instance;
    }

    public void sample() {
        System.out.println("Sample method from singleton_2 called");
    }
}
