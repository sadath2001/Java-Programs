package structural_dp.composite;

public class Main {
    public static void main(String[] args) {
        Department financialDepartment = new FinanceDeparment("Finance department");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();

      
    }
    
}
