package creational_dp.abstract_factory.operating_systems.MAC;

import creational_dp.abstract_factory.interfaces.Button;

public class Mac_button  implements Button{
    @Override
    public void createButton() {
        System.out.println("Mac button created");
    }
}
