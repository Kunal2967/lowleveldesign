

//LSP Violation: A subclass (Bicycle) cannot fully comply with
//the behavior of the base class (Vechile) — turnonengine() is unsupported.

class Vechile{
    void turnonengine(){

    }
}

//The method turnonengine() in the base class Vehicle assumes that every vehicle has an engine.
//But Bicycle doesn’t have one — so overriding it to throw an exception breaks the LSP.
class Bicycle extends Vechile{
    void turnonengine(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    void accelerate(){

    }
}
class Car extends Vechile{
    void turnonengine(){
        System.out.println("turn on engine");
    }
    void accelerate(){
            System.out.println("accelerate");
    }
}
//The principle was introduced by Barbara Liskov in 1987 and according
// to this principle Derived or child classes must be substitutable for their
//base or parent classes. This principle ensures that any class that is the child of a parent
//class should be usable in place of its parent without any unexpected behavior.
abstract  class Vehicle{
    //common vehicle behaviour
    public void accelerate(){
        System.out.println("accelerate");
    }
}
abstract class EngineVehcile extends Vehicle{
    public void turnonengine(){
        System.out.println("turn on engine");
    }
}
abstract class NonEngineVehicle extends Vehicle{
    /// No turnOnEngine method, because it doesn't apply
}

class Taxi extends EngineVehcile{

    public void accelerate(){
        System.out.println("accelerate");
    }
}
class Cycle extends NonEngineVehicle{

    public void accelerate(){
        System.out.println("accelerate cyl");
    }
}

public class Liskov {
    public static void main(String[] args) {
        EngineVehcile engineVehcile=new Taxi();
        engineVehcile.turnonengine();
        engineVehcile.accelerate();
        Cycle cycle=new Cycle();
        cycle.accelerate();
        // No call to turnOnEngine() on cycle — LSP preserved




//        Vechile v=new Vechile();
//        v.turnonengine();
//        Bicycle b=new Bicycle();
//        b.turnonengine();
//        b.accelerate();
//        Car c=new Car();
//        c.turnonengine();
//        c.accelerate();
    }
}
