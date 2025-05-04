package Decorator;

public class ExtraCheese extends ToppingsDecorator{

    public ExtraCheese(BasePIzza basePIzza){
        super(basePIzza);
    }
    @Override
    public int getcost() {
        return basePIzza.getcost()+30;
    }


}
