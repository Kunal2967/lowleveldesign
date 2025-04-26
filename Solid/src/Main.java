//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//class BreadBaker{
//    public void bakeBread(){
//        System.out.println("baking bread");
//    }
//    public void manageInventory(){
//        System.out.println("managing inventory");
//    }
//    public void orderSupplies(){
//        System.out.println("ordering supplies");
//    }
//    public void serveCustomers(){
//        System.out.println("serving customers");
//    }
//    public void cleanBakery(){
//        System.out.println("cleaning bakery");
//    }
//}


//to solvw this
//To adhere to the SRP, the bakery could assign different roles to different i
//ndividuals or teams. For example, there could be a separate person or team responsible
// for managing the inventory, another for ordering supplies,
//another for serving customers, and another for cleaning the bakery.


class BreadBaker{
    void bakeBread(){
        System.out.println("baking bread");
    }
}
class InventoryManager{
    void manageInventory(){
        System.out.println("managing inventory");
    }
}
class SuppliesOrderer{
    void orderSupplies(){
        System.out.println("ordering supplies");
    }
}
class CustomerService{
    void serveCustomers(){
        System.out.println("serving customers");
    }
}
class BakeryCleaner{
    void cleanBakery(){
        System.out.println("cleaning bakery");
    }
}
public class Main {

    public static void main(String[] args) {

        //it breaking single responsibility principle
        // breadbaker is responsible for baking bread but here we are doing all the task
//        BreadBaker bb=new BreadBaker();
//        bb.bakeBread();
//        bb.manageInventory();
//        bb.orderSupplies();
//        bb.serveCustomers();
//        bb.cleanBakery();

        //NOW THIS LOOK GOOD AND FOLLOW SIGNLE RESONPONSIBILITY PRINICPLE
        BreadBaker bb=new BreadBaker();
        InventoryManager im=new InventoryManager();
        SuppliesOrderer so=new SuppliesOrderer();
        CustomerService cs=new CustomerService();
        BakeryCleaner bc=new BakeryCleaner();
        bb.bakeBread();
        im.manageInventory();
        so.orderSupplies();
        cs.serveCustomers();
    }
}

//single responsibility principle
//This principle states that A class should have only one reason to change which means
//        every class should have a single responsibility or single job or single purpose.
//In other words, a class should have only one job or purpose within the software system.

//Imagine a baker who is responsible for baking bread. The baker’s role
//is to focus on the task of baking bread, ensuring that the bread is of high quality,
//        properly baked, and meets the bakery’s standards.
//
//However, if the baker is also responsible for managing the inventory, ordering supplies,
//        serving customers, and cleaning the bakery, this would violate the SRP.
//Each of these tasks represents a separate responsibility, and by combining them,
//the baker’s focus and effectiveness in baking bread could be compromise






//open closed principle
//open for extension, closed for modification
//we cannot modify a class that is used by others we have to extend it to add new functionality use interface and then implement it

//liskov substitution principle
//if b is a subtype of a then objects of type b can be used where objects of type a are required
//without breaking the program

//you then tried to implement this in two classes:
//
//MotorCycle (with an engine) — works fine.
//
//Bicycle (no engine) — throws an exception in turnonengine(), which violates LSP.
//
//LSP Violation: A subclass (Bicycle) cannot fully comply with
//the behavior of the base class (Bike) — turnonengine() is unsupported.
//The principle was introduced by Barbara Liskov in 1987 and according
//        to this principle Derived or child classes must be substitutable for their
//base or parent classes. This principle ensures that any class that is the child of a parent
//class should be usable in place of its parent without any unexpected behavior.
//class Bike{
//     void turnonengine(),
//    void acceleraer
//}
//class motorcyle extends bike{
//    boolean isEngineOn;
//    int speed;
//    @Override
//    public void turnonengine() {
//        isEngineOn=true;
//    }
//    @Override
//    public void accelerate() {
//        speed=speed+10;
//    }
//}
//class Biclye extends bike{
//    public void turnonengine(){
//        /// here behavious getting chnges
//      throw new UnsupportedOperationException("Not supported yet.");
//    }
//    public void accelerate(){
//    }
//}

//so it breaking doiwn liskov aboive class
//to solve it just make a interface and that has method  which can be used in every chiild
//class Bike{
//    void accelerate();
//
//}
//public class motorCykcke extends Bike{
//    Boolean hasEnginer(){
//        return true;
//    }
//    public void accelerate(){
//        System.out.println("accelerate");
//    }
//}
//public  class cyclle extends Bike{
//    public void accelerate(){
//        System.out.println("accelerate");
//    }
//}



//interface segregation principle
//interface shoudl be such that client should implement only the methods it needs
//
//interface RestrauntEmployee{
//    void washDishes();
//    void cookfood();
//    void ServeCustomer();
//}
//class waiter implements RestrauntEmployee{
//    public void washDishes(){
//        //not my job
//    }
//    public void ServeCsutomer(){
//        System.out.println("serve customer");
//    }
//    public void cookfood(){
//        //not my job
//    }
//}
//here clinet neede unnecarry implemntatiom of food like cookfood and wash dishes
//solution below
//interface WaiterInterface{
//    void takeOrder();
//    void ServeCustomer();
//}
//interface ChefInterface{
//    void cookFood();
//    void decideMenu();
//}
//class Waiter implements WaiterInterface{
//    public void takeOrder(){
//        System.out.println("take order");
//    }
//    public void ServeCustomer(){
//        System.out.println("serve customer");
//    }
//}
//class Chef implements ChefInterface{
//    public void cookFood(){
//        System.out.println("cook food");
//    }
//    public void decideMenu(){
//        System.out.println("decide menu");
//    }
//}


//so we break interface into sm,aller interfqqace so that client can only impolemmt use only what they need

//dependency inversion principle

//class shoduld depemed onm interface rather than concrete class

//keyboard(interface)
//    implemtn wired keyboard  and bluetooth keyboarf

//mouse (interface)
// implement wire mouse and bluetooth mouse





