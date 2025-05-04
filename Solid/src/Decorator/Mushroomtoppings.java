package Decorator;

public class Mushroomtoppings extends ToppingsDecorator{

    public Mushroomtoppings(BasePIzza basePIzza){
          super(basePIzza);
      }
    @Override
    public int getcost() {
        return basePIzza.getcost()+5;
    }
}
