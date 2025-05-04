package parkinglot;

import vechile.Vechile;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;

    public ParkingLot(List<ParkingFloor> parkingFloors){
        this.parkingFloors = parkingFloors;
    }

    public ParkingSpot findavaialblespot(String vechileType){
        for (ParkingFloor floor:parkingFloors){
            ParkingSpot spot = floor.findavaialblespot(vechileType);
            if(spot!=null){
                return spot;
            }
        }
        return null;
    }
    public ParkingSpot parkVechile(Vechile vechile){
        ParkingSpot spot = findavaialblespot(vechile.getVechileType());
        if(spot!=null){
            spot.parkVechile(vechile);
            System.out.println("vechile "+vechile.getLicensePlate()+" has been parked in spot "+spot.getspotNUmber());
            return spot;
        }
        System.out.println("no available spot found for vechile "+vechile.getLicensePlate());
        return null;
    }
    public void vacateSpot(ParkingSpot spot,Vechile vechile){
        if(spot!=null && spot.isOccupied() && spot.getVechile().equals(vechile)){
            spot.vacateSpot();
            System.out.println("vechile "+vechile.getLicensePlate()+" has been vacated");
        }else{
            System.out.println("invalid spot number or vacant spot");
        }
    }
    public ParkingSpot getspotNUmber(int spotNumber){
        for (ParkingFloor floor:parkingFloors){
            for (ParkingSpot spot:floor.getParkingSpots()){
                if(spot.getspotNUmber()==spotNumber){
                    return spot;
                }
            }
        }
        return null;
    }

    public List<ParkingFloor> getParkingFloors() {
            return parkingFloors;
    }
}
