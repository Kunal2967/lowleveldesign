package Decoratorqa;

public class MIkk extends CoffeeDecorator{
    public MIkk(Coffee coffee){
        super(coffee);
    }
    public String getDescription(){
        return coffee.getDescription() + ", Milk";
    }
    public double getcost(){
        return coffee.getcost()+1.200;
    }
}
