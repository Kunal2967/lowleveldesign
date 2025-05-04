package vechile;

public class BikeVechile extends Vechile {
    private static final double rate=5.0;
    public BikeVechile(String licensePlate) {
        super(licensePlate,"Bike");
    }
    @Override
    public double calculatefee(int hourStayed) {
        return hourStayed*rate;
    }
}
