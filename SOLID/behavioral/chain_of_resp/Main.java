package behavioral.chain_of_resp;

public class Main {
   public static void main(String[] args) {
    PaymentHandler obj1=new Card();
    PaymentHandler obj2=new Paypal();
    PaymentHandler obj3=new RTGS();
    obj1.setNext(obj2);
    obj2.setNext(obj3);

    obj1.handleTransaction(200);
    obj1.handleTransaction(1000600);
    obj1.handleTransaction(600);
   }
    
}
