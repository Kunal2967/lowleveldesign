package Decoratorqa;

public class Cappuccino implements Coffee{
    @Override
    public String getDescription() {
        return "Cappuccino";
    }
    @Override
    public double getcost() {
        return 15;
    }
}
