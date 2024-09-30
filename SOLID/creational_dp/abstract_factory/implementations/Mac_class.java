package creational_dp.abstract_factory.implementations;

import creational_dp.abstract_factory.interfaces.Button;
import creational_dp.abstract_factory.interfaces.Checkbox;
import creational_dp.abstract_factory.interfaces.GUIfactory;
import creational_dp.abstract_factory.operating_systems.MAC.Mac_button;
import creational_dp.abstract_factory.operating_systems.MAC.Mac_checkbox;

//factory_class
public class Mac_class implements GUIfactory{

    @Override
    public Button createButton() {
        return new Mac_button();
    }

    @Override
    public Checkbox createCheckbox() {
        return new Mac_checkbox();
    }
    
}
