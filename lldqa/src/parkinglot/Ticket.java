package parkinglot;

import vechile.Vechile;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private ParkingSpot parkingSpot;
    private Vechile vechile;
    private LocalDateTime startTime;
    private String ticketId;

    public Ticket(ParkingSpot parkingSpot,Vechile vechile){
        this.parkingSpot = parkingSpot;
        this.vechile = vechile;
        this.startTime = LocalDateTime.now();
        this.ticketId = UUID.randomUUID().toString();
    }
    public String getTicketId() {
        return ticketId;
    }
    public Vechile getVechile() {
        return vechile;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    public String toString() {
        return "\n+---------------------------------------------+" +
                "\n|           WALMART PARKING TICKET            |" +
                "\n+---------------------------------------------+" +
                "\n| Ticket ID:  " + String.format("%-28s", ticketId) + " |" +
                "\n| Vehicle:    " + String.format("%-28s", vechile.getLicensePlate()) + " |" +
                "\n| Spot No:    " + String.format("%-28s", parkingSpot.getspotNUmber()) + " |" +
                "\n| Entry Time: " + String.format("%-28s", startTime) + " |" +
                "\n+---------------------------------------------+" +
                "\n| Please keep this ticket safe                |" +
                "\n| Present this ticket when exiting            |" +
                "\n+---------------------------------------------+";
    }
}
