package observerpatternwallmart;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String productname;
    private List<Observer> customers=new ArrayList<>();
    boolean isAvailable=true;
    public Product(String productname) {
        this.productname = productname;
    }
    @Override
    public void subscribe(Observer observer) {
        customers.add(observer);
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
        notifyObservers();
    }

    public void unsubscribe(Observer observer){
        customers.remove(observer);
    }
    public void notifyObservers(){
        for(Observer o:customers){
            o.update(productname);
        }
    }


}
