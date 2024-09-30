package structural_dp.decorator;

public class PizzaDecorator implements Pizza {
    Pizza pizza;
    public PizzaDecorator(Pizza pizza)
    {
        this.pizza = pizza;
    }
    @Override
    public String bakePizza()
    {
        return pizza.bakePizza();
    }
    
}
