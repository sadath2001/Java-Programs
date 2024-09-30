package solid_principles.Caclulator_SO;
class Calculator{
    public int CalculatorName(int num1,int num2, Operation op)
    {
        return op.perform(num1,num2);
    }
    
}
