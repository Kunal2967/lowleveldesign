package parkinglot;

import vechile.Vechile;

public class BikeParkingSpot extends ParkingSpot {

    public BikeParkingSpot(int spotNumber){
        super(spotNumber,"Bike");
    }

    public boolean canParkVechile(Vechile vechile){
        return  "Bike".equalsIgnoreCase(vechile.getVechileType());
    }

}
