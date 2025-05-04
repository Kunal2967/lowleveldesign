package factory;

public class ShapeFactory {
    Shape getShape(String shapeType){
        switch (shapeType){
            case "Square":
                return new Square();
                case "Rectangle":
                      return new Rectangle();
                      default:
                    return null;

        }
    }
}
