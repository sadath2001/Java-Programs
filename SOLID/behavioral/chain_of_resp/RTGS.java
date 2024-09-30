package behavioral.chain_of_resp;

public class RTGS extends PaymentHandler{
    @Override
    public void handleTransaction(double amount)
    {
        if(amount>1000)
        {
            System.out.println("amount debited");
        }
        else{
            next.handleTransaction(amount);
        }
    }   
    
}
