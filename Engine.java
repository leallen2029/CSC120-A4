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
    public Boolean go() {
        if (currentFuelLevel > 0) {
            currentFuelLevel--;
            System.out.println("Remaining fuel: " + currentFuelLevel);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 5.0, 100.0);

        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }

        System.out.println("Out of fuel.");
    }
}