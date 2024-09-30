package structural_dp.decorator;

public class AddCheeze  extends PizzaDecorator{
    public AddCheeze(Pizza pizza)
    {
       super(pizza);
    }
    @Override
    public String bakePizza()
    {
        return pizza.bakePizza() + "with cheeze";
    }
    
}
