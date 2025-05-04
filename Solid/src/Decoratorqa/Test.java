package Decoratorqa;

public class Test {
    public static void main(String[] args) {

       Coffee coffee=new MIkk(new Sugar(new Cappuccino()));
        System.out.println(coffee.getDescription()+", "+coffee.getcost());


    }
}
