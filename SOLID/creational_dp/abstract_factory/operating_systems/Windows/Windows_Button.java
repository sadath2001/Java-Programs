package creational_dp.abstract_factory.operating_systems.Windows;

import creational_dp.abstract_factory.interfaces.Button;

public class Windows_Button  implements Button{
    @Override
    public void createButton() {
        System.out.println("Windows button created");
    }
}
