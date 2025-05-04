package parkinglot;

import vechile.Vechile;

public class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(int spotNumber){
        super(spotNumber,"Car");
    }
    public boolean canParkVechile(Vechile vechile){
        return "Car".equalsIgnoreCase(vechile.getVechileType());
    }
}
