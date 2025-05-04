package gates;

import parkinglot.ParkingLot;
import parkinglot.ParkingSpot;
import payment.PaymentService;
import vechile.Vechile;

public class ExitGate {
    private ParkingLot parkingLot;
    private PaymentService paymentService;
    public ExitGate(ParkingLot parkingLot, PaymentService paymentService) {
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }
    public void processExit(int spotNumber,int hourstayed){
        ParkingSpot spot=parkingLot.getspotNUmber(spotNumber);
        if(spot==null || !spot.isOccupied()){
            System.out.println("Invalid Spot Number or vacant spot");
            return;
        }
        Vechile vechile=spot.getVechile();
        if(vechile==null){
            System.out.println("no vechile found in the spot");
            return;
        }
        double fee=vechile.calculatefee(hourstayed);
        paymentService.processPayment(fee);

        parkingLot.vacateSpot(spot,vechile);
        System.out.println("vechile "+vechile.getLicensePlate()+" has been vacated");

    }
}
