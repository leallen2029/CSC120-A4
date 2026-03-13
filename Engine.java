public class Engine implements EngineRequirements {

    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

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

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    // Refuel method
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    // Go method
    public Boolean go() {
        if (currentFuelLevel > 0) {
            currentFuelLevel--;
            System.out.println("Engine running; Remaining fuel: " + currentFuelLevel);
            return true;
        } else {
            return false;
        }
    }

    // Test
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}