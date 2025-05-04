package main;

import gates.EntrenceGate;
import gates.ExitGate;
import parkinglot.ParkingFloor;
import parkinglot.ParkingLot;
import payment.PaymentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ParkingFloor floor=new ParkingFloor(1,2,2); //// 2 car spots and 2 bike spots
        ArrayList<ParkingFloor> floors=new ArrayList<>();
        floors.add(floor);
        ParkingLot parkingLot=new ParkingLot(floors);

        PaymentService paymentService=new PaymentService(sc);
        EntrenceGate entrenceGate=new EntrenceGate(parkingLot);
        ExitGate exitGate=new ExitGate(parkingLot,paymentService);

        System.out.println("\n===========================");
        System.out.println("Welcome to Wallmart Parking");
        System.out.println("===========================");
        Boolean exit=false;
        while (!exit){
            showMenu();
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    parkVehicle(entrenceGate);
                    break;
                case 2:
                    vacateSpot(exitGate,sc);
                    break;
                case 3:
                    exit=true;
                    System.out.println("Thank you for parking at Wallmart Parking");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();

    }
    public static void showMenu(){
        System.out.println("\n******************************************************");
        System.out.println("Please choose an option from below:");
        System.out.println("1. Park Vehicle");
        System.out.println("2. Vacate Spot");
        System.out.println("3. Exit");
    }
    public static void parkVehicle(EntrenceGate entrenceGate){
        entrenceGate.processEntrace();
    }
    public static void vacateSpot(ExitGate exitGate,Scanner sc){
        System.out.println("Enter the spot number: ");
        int spotNumber=sc.nextInt();
        System.out.println("Enter the number of hours you stayed: ");
        int hourstayed=sc.nextInt();
        exitGate.processExit(spotNumber,hourstayed);
    }
}
