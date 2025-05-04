package gates;

import parkinglot.ParkingLot;
import parkinglot.ParkingSpot;
import vechile.Vechile;
import vechile.VechileFactory;

import java.util.Scanner;

public class EntrenceGate {
    private ParkingLot parkingLot;

    public EntrenceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
    public void processEntrace(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the vehicle license plate: ");
        String licensePlate = scanner.next();
        System.out.println("Enter the vehicle type (Car or Bike): ");
        String vehicleType = scanner.next();

        Vechile vechile= VechileFactory.createVechile(vehicleType,licensePlate);
        if(vechile==null){
            System.out.println("Invalid Vechile");
            return;
        }
        ParkingSpot spot=parkingLot.parkVechile(vechile);
        if(spot==null){
            System.out.println("No available spot found for vehicle");
        }
        else{
            System.out.println("Vehicle parked in spot "+spot.getspotNUmber());
        }

    }
}
