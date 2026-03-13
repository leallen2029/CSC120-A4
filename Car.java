import java.util.ArrayList;

public class Car implements CarRequirements {

    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    // Constructor
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        passengers = new ArrayList<Passenger>();
    }

    // maximum capacity of car
    public int getCapacity() {
        return maxCapacity;
    }

    // Returns seats remaining
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    // Adds passenger if there's space
    public boolean addPassenger(Passenger p) {
        if (passengers.size() < maxCapacity) {
            passengers.add(p);
            return true;
        }
        return false;
    }

    // Removes a passenger if they are in the car
    public boolean removePassenger(Passenger p) {
        if (passengers.contains(p)) {
            passengers.remove(p);
            return true;
        }
        return false;
    }

    // Prints passenger list
    public void printManifest() {
        if (passengers.size() == 0) {
            System.out.println("This car is EMPTY.");
        } else {
            for (Passenger p : passengers) {
                System.out.println(p);
            }
        }
    }
}