package vechile;

public class CarVechile extends Vechile {
    private static  final double rate=10.0;
    public CarVechile(String licensePlate) {
        super(licensePlate,"Car" );
    }
    @Override
    public double calculatefee(int hourStayed) {
        return hourStayed*rate;
    }
}
