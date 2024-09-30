package structural_dp.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza=new AddJalepeno(new AddCheeze(new BasePizza()));
        System.out.println(pizza.bakePizza());
    }
    
}
