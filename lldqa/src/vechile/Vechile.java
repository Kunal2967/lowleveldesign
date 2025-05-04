package vechile;

public abstract  class Vechile {
    private String licensePlate;
    private String vechileType;

    public Vechile(String licensePlate, String vechileType) {
            this.licensePlate = licensePlate;
            this.vechileType = vechileType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    public String getVechileType() {
        return vechileType;
    }
    public abstract double calculatefee(int hourStayed);
}
