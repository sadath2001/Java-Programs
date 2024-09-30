package structural_dp.composite;

public class FinanceDeparment implements Department {
    private String name;
    public FinanceDeparment(String name)
    {
        this.name = name;
    }
    @Override
    public void printDepartmentName()
    {
        System.out.println("Finance Department: " + name);
    }   
    
}
