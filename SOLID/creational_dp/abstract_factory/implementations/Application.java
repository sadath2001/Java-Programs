package creational_dp.abstract_factory.implementations;

import creational_dp.abstract_factory.interfaces.Button;
import creational_dp.abstract_factory.interfaces.Checkbox;
import creational_dp.abstract_factory.interfaces.GUIfactory;

//factory of factory classes
public class Application {
    Button button;
    Checkbox checkbox;
    public Application(GUIfactory obj)
    {
       button= obj.createButton();
        checkbox=obj.createCheckbox();
    }
    public void create()
    {
        button.createButton();
        checkbox.createCheckbox();
    }
}
