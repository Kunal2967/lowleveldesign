package gates;

import parkinglot.ParkingLot;
import parkinglot.ParkingSpot;
import parkinglot.Ticket;
import vechile.Vechile;
import vechile.VechileFactory;

import java.util.Scanner;

public class EntrenceGate {
    private ParkingLot parkingLot;
    private Scanner scanner;
    public EntrenceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        this.scanner=new Scanner(System.in);
    }
    public Ticket processEntrace(){
        System.out.println("Enter the vehicle license plate: ");
        String licensePlate = scanner.next();
        System.out.println("Enter the vehicle type (Car or Bike): ");
        String vehicleType = scanner.next();

        Vechile vechile= VechileFactory.createVechile(vehicleType,licensePlate);
        if(vechile==null){
            System.out.println("Invalid Vechile");
            return null;
        }
        ParkingSpot spot=parkingLot.parkVechile(vechile);
        if(spot==null){
            System.out.println("No available spot found for vehicle");
        }
        else{
            System.out.println("Vehicle parked in spot "+spot.getspotNUmber());
        }
        Ticket ticket=parkingLot.getTicketBySpotNumber(spot.getspotNUmber());
        System.out.println(ticket);
        return ticket;

    }
}
