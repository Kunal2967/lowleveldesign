package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;

    public ParkingFloor(int floorNumber,int numberOfcarSpots,int numberOfbikeSpots){
        this.floorNumber = floorNumber;
        this.parkingSpots=new ArrayList<>();

        for(int i=0;i<numberOfcarSpots;i++){
            parkingSpots.add(new CarParkingSpot(i+1));
        }

        for(int i=numberOfcarSpots;i<numberOfbikeSpots+numberOfcarSpots;i++){
            parkingSpots.add(new BikeParkingSpot(i+1));
        }
    }

    public  ParkingSpot findavaialblespot(String vechileType){
        for (ParkingSpot spot:parkingSpots){
                if(!spot.isOccupied() && spot.getSpottype().equalsIgnoreCase(vechileType)){
                    return spot;
                }
        }
        return null;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
