package payment;

public class Upipayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing upi payment"+" "+amount);
    }
}
