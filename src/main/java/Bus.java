import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination) {
        this.destination = destination;
        capacity = 3;
        passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if (capacity - passengers.size() >= 1) {
            passengers.add(person);
        }
    }
}