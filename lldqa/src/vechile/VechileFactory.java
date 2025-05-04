package vechile;

public class VechileFactory {
    public static Vechile createVechile(String type,String licensePlate){
        if(type.equalsIgnoreCase("Car")){
            return new CarVechile(licensePlate);
        }else if(type.equalsIgnoreCase("Bike")){
            return new BikeVechile(licensePlate);
        }else{
            return null;
        }
    }
}
