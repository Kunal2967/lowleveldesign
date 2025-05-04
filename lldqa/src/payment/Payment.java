package payment;

public class Payment {
    private PaymentStrategy paymentStrategy;
    private double amount;

    public Payment(PaymentStrategy paymentStrategy,double amount){
        this.paymentStrategy=paymentStrategy;
        this.amount=amount;
    }
    public void processPayment(){
        if(amount>0) {
            paymentStrategy.processPayment(amount);
        }else {
            System.out.println("Invalid amount");
        }
    }
}
