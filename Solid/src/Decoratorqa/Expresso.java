package Decoratorqa;

public class Expresso implements Coffee{
    @Override
    public String getDescription() {
        return "Expresso";
    }
    @Override
    public double getcost() {
        return 10;
    }
}
