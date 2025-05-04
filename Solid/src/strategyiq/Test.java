package strategyiq;

public class Test {
    public static void main(String[] args) {
        ShoppingCartContext sc=new ShoppingCartContext();
        sc.setPaymentStrategy(new Debit());
        sc.pay(1000);

        sc.setPaymentStrategy(new CreditCard());
        sc.pay(1000);
    }
}
