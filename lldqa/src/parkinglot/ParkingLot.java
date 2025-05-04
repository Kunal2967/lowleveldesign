package parkinglot;

import vechile.Vechile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;
    private Map<String, Ticket> activeTickets; // Store tickets by their ID
    private Map<Integer, Ticket> spotToTicketMap; // For quick lookup by spot number

    public ParkingLot(List<ParkingFloor> parkingFloors){
        this.parkingFloors = parkingFloors;
        this.activeTickets = new HashMap<>();
        this.spotToTicketMap = new HashMap<>();
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
            Ticket ticket = new Ticket(spot, vechile);
            activeTickets.put(ticket.getTicketId(), ticket);
            spotToTicketMap.put(spot.getspotNUmber(), ticket);
            System.out.println("vechile "+vechile.getLicensePlate()+" has been parked in spot "+spot.getspotNUmber());
            return spot;
        }
        System.out.println("no available spot found for vechile "+vechile.getLicensePlate());
        return null;
    }

    public Ticket getTicketBySpotNumber(int spotNumber) {
        return spotToTicketMap.get(spotNumber);
    }

    public Ticket getTicketById(String ticketId) {
        return activeTickets.get(ticketId);
    }
    public void vacateSpot(ParkingSpot spot,Vechile vechile){
        if(spot!=null && spot.isOccupied() && spot.getVechile().equals(vechile)){
            spot.vacateSpot();
            Ticket ticket = spotToTicketMap.get(spot.getspotNUmber());
            if (ticket != null) {
                activeTickets.remove(ticket.getTicketId());
                spotToTicketMap.remove(spot.getspotNUmber());
            }
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
