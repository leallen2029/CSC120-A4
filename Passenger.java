public class Passenger implements PassengerRequirements {

    private String name;

    // constructor
    public Passenger(String name) {
        this.name = name;
    }

    // accessor
    public String getName() {
        return name;
    }

    // board car
    public boolean boardCar(Car c) {
        return c.addPassenger(this);
    }

    // get off car
    public boolean getOffCar(Car c) {
        return c.removePassenger(this);
    }

    // prints passenger names
    public String toString() {
        return name;
    }
}