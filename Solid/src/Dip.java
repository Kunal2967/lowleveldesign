public  class Dip{

    //dip suggest that class shoule not depend on low level module
    //but should depend on abstrctaction
    //abstraction shoud not depend on details
    //details shoud depend on abstraction
    //in short dip suggest that class should rely on abstracion(interface or abstract class)
    //and not on concrete class
    //additionally abstraction shouldn not depend on details
    //details shoud depend on abstraction
    //in short dip suggest that class should rely on abstracion(interface or abstract class)
    //and not on concrete class

    ////🌟Why it matters:
//  • Promotes decoupled architecture.
//• Facilitates testing and maintainability
//
//  static   class LightBulb{
//        public void turnon(){
//            System.out.println("turn on");
//        }
//        public void turnoff(){
//            System.out.println("turn off");
//        }
//    }
//
////here switch is a high levelclass that depends on light bulb means tightly coupled with light bulb(a low level class)
////if we want to switcha fan or smart led , we must change the switch class
////voulating dependency inversion principle and also open closed principle
//
//   static class Switch {
//          private LightBulb bulb;
//          public Switch(LightBulb bulb) {
//          this.bulb = bulb;
//          }
//          public void operate(String command){
//              if(command.equals("ON"))
//              {
//                  bulb.turnon();
//              }else{
//                  bulb.turnoff();
//              }
//          }
//    }


interface Switchable{
   void turnon();
    void turnoff();
    }
    static class LightBulb implements Switchable{

         public void turnon(){
             System.out.println("turn on");
         }
         public void turnoff(){
             System.out.println("turn off");
         }
    }
    static class Fan implements Switchable{
        public void turnon(){
            System.out.println("fan turn on");
        }
        public void turnoff(){
            System.out.println("fan turn off");
        }
    }
    static class Switch{
    private Switchable device;
    public Switch(Switchable device){
           this.device=device;
    }
    public void operate(String command){
        if(command.equals("ON")){
            device.turnon();
        }else{
            device.turnoff();
        }
    }

    }

    public static void main(String[] args) {
//             LightBulb lb=new LightBulb();
//             Switch s=new Switch(lb);
//             s.operate("ON");
//             s.operate("OFF");

        LightBulb lb=new LightBulb();
        Fan fan=new Fan();
        Switch s=new Switch(lb);
        s.operate("ON");
        s.operate("OFF");
        Switch s1=new Switch(fan);
        s1.operate("ON");
        s1.operate("OFF");
    }

}


//interface  Switchable{
//    void turnON();
//    void turnOFF();
//}
//
//class LightBulb implements Switchable {
//    public void turnON() {
//        System.out.println("LightBulb turned ON");
//    }
//
//    public void turnOFF() {
//        System.out.println("LightBulb turned OFF");
//    }
//}
//
//class Fan implements Switchable {
//    public void turnON() {
//        System.out.println("Fan started spinning");
//    }
//
//    public void turnOFF() {
//        System.out.println("Fan stopped spinning");
//    }
//}
//
//class Switch {
//
//    private Switchable device;
//    public Switch(Switchable device){
//        this.device=device;
//    }
//    public void operate(String cmd){
//        if(cmd.equals("ON")){
//            device.turnON();
//        }else{
//            device.turnOFF();
//        }
//    }
//}
////low level modukle
//public class Dip {
//
//    //dependency inversion principle state that high level module should
//    // not depend on low level module
//    //both should depend on abstrctactions
//    //additosmlhy abstractiobn shohdk not depend on details
//
//    // in shrort dip suggest that class should rely on abstracion(interface or abstract class)
//    // and not on concrete class
//    //additionally abstraction shouldn not depend on details
//    //details shoud depend on abstraction
//
////🌟Why it matters:
//  • Promotes decoupled architecture.
//• Facilitates testing and maintainability


//
//    public static void main(String[] args) {
//
//
////        Switch doesn't depend on LightBulb or Fan directly.
////
////        It only depends on the interface Switchable.
////
////        So it's open for extension (OCP) and inverts dependencies (DIP).
//        Switchable lightBulb=new LightBulb();
//        Switchable fan=new Fan();
//        Switch s=new Switch(lightBulb);
//        s.operate("ON");
//        s.operate("OFF");
//        Switch s1=new Switch(fan);
//        s1.operate("ON");
//        s1.operate("OFF");
//    }
//}
