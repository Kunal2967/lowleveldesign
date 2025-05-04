package payment;

import java.util.Scanner;

public class PaymentService {

    private Scanner sc;

    public PaymentService(Scanner sc){
        this.sc=sc;
    }

    public  void processPayment(double amount){
        choosepaymentmethod(amount);
    }
    private void choosepaymentmethod(double amount){
        System.out.println("Amount to be paid: "+amount);
        System.out.println("Choose payment method");
        System.out.println("1.Cash");
        System.out.println("2.Credit Card");
        System.out.println("3.UPI");
        int choice=sc.nextInt();
       Payment payment;
        switch (choice){
            case 1:
                payment=new Payment(new Cash(),amount );

                break;
            case 2:
                payment=new Payment(new CreditCard(),amount );

                break;
            case 3:
                payment=new Payment(new Upipayment(),amount );

                break;
            default:
                System.out.println("Invalid choice");
                payment=new Payment(new Cash(),amount );
                break;
        }
        payment.processPayment();
    }

}
