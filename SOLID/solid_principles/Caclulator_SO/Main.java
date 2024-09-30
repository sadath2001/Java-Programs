package solid_principles.Caclulator_SO;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try{
            System.out.println(calculator.CalculatorName(5, 5, new Addition()));
            System.out.println(calculator.CalculatorName(5, 0, new Division()));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
