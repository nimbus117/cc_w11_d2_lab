public class Bus {

    private String destination;
    private int capacity;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = 20;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }
}
