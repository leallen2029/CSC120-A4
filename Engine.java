public class Engine implements EngineRequirements {

    private final FuelType fuelType;
    private double currentFuelLevel;
    private final double maxFuelLevel;

    // Constructor
    public Engine(FuelType fuelType, double currentFuelLevel, double maxFuelLevel) {
        this.fuelType = fuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    // Accessors
    public FuelType getFuelType() {
        return fuelType;
    }

    public double getCurrentFuel() {
        return currentFuelLevel;
    }

    public double getMaxFuel() {
        return maxFuelLevel;
    }

    // Refuel method
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    // Go method
    public boolean go() {
        if (currentFuelLevel > 0) {
            currentFuelLevel--;
            System.out.println("Remaining fuel: " + currentFuelLevel);
            return true;
        }
        return false;
    }
}