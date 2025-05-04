package payment;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment"+" "+amount);
    }
}
