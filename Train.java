import java.util.ArrayList;

public class Train implements TrainRequirements {

    private final Engine engine;
    private final ArrayList<Car> cars;

    // Constructor
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        cars = new ArrayList<Car>();

        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    // Accessor for engine
    public Engine getEngine() {
        return engine;
    }

    // Gets a specific car
    public Car getCar(int i) {
        return cars.get(i);
    }

    // Maximum capacity of the train
    public int getMaxCapacity() {
        int total = 0;
        for (Car c : cars) {
            total += c.getCapacity();
        }
        return total;
    }

    // Remaining seats across all cars
    public int seatsRemaining() {
        int total = 0;
        for (Car c : cars) {
            total += c.seatsRemaining();
        }
        return total;
    }

    // Print passengers on the train
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i + ":");
            cars.get(i).printManifest();
        }
    }
}