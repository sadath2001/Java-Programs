package structural_dp.proxy;

public class Bank implements Account {
    @Override
    public void withDraw(int amount)
    {
        System.out.println("Amount withdrawn from bank: " + amount);
    }
    @Override
    public void getAcNo()
    {
        System.out.println("Account number: 1234567890");
    }
}
