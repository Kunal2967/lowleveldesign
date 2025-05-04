package parkinglot;

import vechile.Vechile;

public abstract class ParkingSpot {

    private int spotNumber;
    private boolean isoccupied;

    private Vechile vechile;
    private String spottype;

  public ParkingSpot(int spotNumber, String spottype) {
      this.spotNumber = spotNumber;
      this.spottype = spottype;
      this.isoccupied = false;
  }

  public abstract boolean canParkVechile(Vechile vechile);

  public void parkVechile(Vechile vechile)
  {
     if(isoccupied)
     {
      throw new IllegalStateException("Parking spot is occupied");
     }
     if(!canParkVechile(vechile)){
         throw new IllegalArgumentException("vechile can not be parked in this spot"+" "+vechile.getVechileType());
     }
     this.isoccupied=true;
     this.vechile=vechile;
  }
  public void vacateSpot()
  {
     if(!isOccupied()){
         throw new IllegalStateException("Parking spot is vacant");
     }
      isoccupied=false;
      this.vechile=null;
  }

  public int getspotNUmber() {
      return spotNumber;
  }
  public boolean isOccupied() {
      return isoccupied;
  }
  public Vechile getVechile() {
      return vechile;
  }
  public String getSpottype() {
      return spottype;
  }

  public String toString() {
      return "Parking spot "+spotNumber+" is "+(isoccupied?"occupied":"vacant");
  }

}
