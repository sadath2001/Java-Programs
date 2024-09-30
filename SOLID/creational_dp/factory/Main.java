package creational_dp.factory;

public class Main {
    public static void main(String[] args) {
        factory_main factory=new factory_main();
        abstract_factory car=factory.get_factory("fuel");
        car.engine();
        abstract_factory ev_car=factory.get_factory("ev");
        ev_car.engine();
    }
}
