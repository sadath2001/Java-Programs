package structural_dp.decorator;

public class AddJalepeno extends PizzaDecorator{
    public AddJalepeno(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String bakePizza()
    {
        return pizza.bakePizza() + " With Jalepeno";
    }
    
}
