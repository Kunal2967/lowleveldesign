package Decoratorqa;

public class Sugar extends CoffeeDecorator{

      public Sugar(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
    @Override
    public double getcost() {
        return coffee.getcost()+3.4;
    }
}
