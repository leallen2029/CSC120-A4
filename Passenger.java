public class Passenger implements PassengerRequirements {

    private final String name;

    // constructor
    public Passenger(String name) {
        this.name = name;
    }

    // accessor
    public String getName() {
        return name;
    }

    // board car
    public void boardCar(Car c) {
        c.addPassenger(this);
    }

    // get off car
    public void getOffCar(Car c) {
        c.removePassenger(this);
    }

    // prints passenger names
    public String toString() {
        return name;
    }
}