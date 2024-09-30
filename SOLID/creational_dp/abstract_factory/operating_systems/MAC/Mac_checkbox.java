package creational_dp.abstract_factory.operating_systems.MAC;


import creational_dp.abstract_factory.interfaces.Checkbox;

public class Mac_checkbox  implements Checkbox{
    @Override
    public void createCheckbox() {
        System.out.println("Mac checkbox created");
    }
    
}
