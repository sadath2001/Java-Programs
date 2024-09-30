package behavioral.chain_of_resp;

public class Card extends PaymentHandler{
   @Override
   public void handleTransaction(double amount)
   {
        if(amount>100 && amount<500)
        {
            System.out.println("amount debited");
        }
        else{
            next.handleTransaction(amount);
        }
   }
    
}
