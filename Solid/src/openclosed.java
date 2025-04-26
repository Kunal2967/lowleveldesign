
abstract class Shape{
    public abstract double calculateArea();
}
class Square extends Shape{
    private double side;
    public Square(double side){
        this.side=side;
    }
    @Override
    public double calculateArea(){
        return side*side;
    }

}
class Rectanngle extends Shape{
    private double length,width,height;
    public Rectanngle(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    @Override
    public double calculateArea(){
        return length*width*height;
    }
}
public class openclosed {

    //suppose we have a shape class that clalcuiate the area of doffered shape
    // intially it support only square and rectangle
    //but what if want to add rectangle so it require modify the exsitimg code
    // hernce open closed principle state that software entities should be open for extension
    // but closed for modification so it voilates the open closed principle


//    class Shape{
//        private String type;
//        public  double calculateArea(){
//           if (type.equalsIgnoreCase("square")){
//               return 1;
//           }else if (type.equalsIgnoreCase("rectangle")){
//               return 2;
//           }
//           //add more type of shape
//
//            //This violates the Open/Closed Principle because adding a new shape, like a triangle, requires modifying the existing code.
//           // This can lead to potential bugs and makes the code harder to maintain
//           return 0;
//        }
//    }


    public static void main(String[] args) {
             Shape Square=new Square(5);
             System.out.println(Square.calculateArea());

             Shape recant=new Rectanngle(3,4,5);
  System.out.println(recant.calculateArea());
    }
}
