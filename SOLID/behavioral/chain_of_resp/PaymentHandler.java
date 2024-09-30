package behavioral.chain_of_resp;


public abstract class PaymentHandler {
    protected PaymentHandler next;
    public void setNext(PaymentHandler next) {
        this.next = next;
    }
    public abstract void handleTransaction(double amount);
  
}
