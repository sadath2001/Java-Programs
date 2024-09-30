package creational_dp.abstract_factory.implementations;

public class Main {
    public static void main(String[] args) {
        Application app=new Application(new Windows_class());
        app.create();
        Application app2=new Application(new Mac_class());
        app2.create();
    }
}
