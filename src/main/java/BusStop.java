import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        queue = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getQueueCount() {
        return queue.size();
    }

    public void addPersonToQueue(Person person) {
        queue.add(person);
    }
}
