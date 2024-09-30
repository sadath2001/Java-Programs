package creational_dp.abstract_factory.operating_systems.Windows;
import creational_dp.abstract_factory.interfaces.Checkbox;
public class Windows_checkbox implements Checkbox{
    @Override
    public void createCheckbox() {
        System.out.println("Windows checkbox created");
    }
    
}
