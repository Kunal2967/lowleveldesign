package payment;

public class Cash implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment"+" "+amount);
    }
}
