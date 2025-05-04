package parkinglot;

import vechile.Vechile;

import java.time.LocalDateTime;

public class Ticket {
    private ParkingSpot parkingSpot;
    private Vechile vechile;
    private LocalDateTime startTime;

    public Ticket(ParkingSpot parkingSpot,Vechile vechile){
        this.parkingSpot = parkingSpot;
        this.vechile = vechile;
        this.startTime = LocalDateTime.now();
    }
}
