package creational_dp.abstract_factory.implementations;

import creational_dp.abstract_factory.interfaces.Button;
import creational_dp.abstract_factory.interfaces.Checkbox;
import creational_dp.abstract_factory.interfaces.GUIfactory;
import creational_dp.abstract_factory.operating_systems.Windows.Windows_Button;
import creational_dp.abstract_factory.operating_systems.Windows.Windows_checkbox;

public class Windows_class implements GUIfactory{

    @Override
    public Button createButton() {
        return new Windows_Button();
    }

    @Override
    public Checkbox createCheckbox() {
        return new Windows_checkbox();
    }
    
}
