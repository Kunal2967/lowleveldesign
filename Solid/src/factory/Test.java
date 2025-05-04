package factory;

public class Test {
    //factory design pattern is creatiomnal provide
    //an interface for creating an object
    // without exposing the creation logic to the client.
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory(); //it will create shapefacoty object
        Shape shape=shapeFactory.getShape("Square"); //will return the object of particluar shape
        shape.draw();
    }
}
//
//
//The Abstract Factory Pattern is a creational design pattern that provides an interface for/
// / creating families of related or dependent objects without
// specifying their concrete classes. It's essentially a "factory of factories."
//Key Differences from Simple Factory
//While a regular Factory Pattern creates objects from a single family, the Abstract Factory Pattern creates entire families of related objects without specifying their concrete classes.