package Decorator;

public abstract  class ToppingsDecorator extends BasePIzza{
    protected BasePIzza basePIzza;
    public ToppingsDecorator(BasePIzza basePIzza){
        this.basePIzza = basePIzza;
    }
}
