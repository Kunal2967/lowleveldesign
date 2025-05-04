package observerpatternwallmart;

public class Demo {
    public static void main(String[] args) {
        Product iphone=new Product("iphone");
        Customer c1=new Customer("ravi");
        Customer c2=new Customer("shyam");
        Customer c3=new Customer("mohan");
        iphone.subscribe(c1);
        iphone.subscribe(c2);

       iphone.setAvailable(true);
        //iphone.subscribe(c1);

        //iphone.setAvailable(true);
    }
}
