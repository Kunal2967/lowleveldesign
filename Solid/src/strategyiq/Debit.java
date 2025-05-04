package strategyiq;

public class Debit implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying using debit card"+" "+amount);
    }
}
