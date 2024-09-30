package behavioral.chain_of_resp;

public class Paypal extends PaymentHandler{
    @Override
    public void handleTransaction(double amount)
    {
        if(amount>500 && amount<1000)
        {
            System.out.println("amount debited");
        }
        else{
            next.handleTransaction(amount);
        }
    }
    
}
