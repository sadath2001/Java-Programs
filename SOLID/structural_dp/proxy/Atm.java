package structural_dp.proxy;

public class Atm implements Account {
    private Account account;
    public Atm()
    {
        account=new Bank();
    }
    @Override
    public void withDraw(int amount)
    {
        account.withDraw(amount);
    }
    @Override
    public void getAcNo()
    {
        account.getAcNo();
    }
    
}
