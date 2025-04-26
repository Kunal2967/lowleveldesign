package observerpatternwallmart;

public class Customer implements Observer {

    private String name;
    public Customer(String name) {
        this.name = name;
    }
    @Override
    public void update(String productname) {
        System.out.println("Hey "+ name + "" + productname + "is came in stock now");

        sendEmail(productname);

        // OR send SMS
        sendSMS(productname);

        // OR send Push Notification
        sendPushNotification(productname);
    }


    private void sendEmail(String productName) {
        System.out.println("Email: " + productName + " back in stock!");
    }

    private void sendSMS(String productName) {
        System.out.println("SMS: " + productName + " available now!");
    }

    private void sendPushNotification(String productName) {
        System.out.println("App Notification: Hurry! " + productName + " is back!");
    }
}
