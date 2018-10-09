import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Person person1;
    Person person2;
    Person person3;
    Person person4;
    Bus bus;

    @Before
    public void before() {
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
        bus = new Bus("Leith");
    }

    @Test
    public void hasDestination() {
        assertEquals("Leith", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void hasPassengers() {
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person1);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void canAddPassengerCapacityFull() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        bus.addPassenger(person4);
        assertEquals(3, bus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.removePassenger(person1);
        assertEquals(1, bus.getPassengerCount());
    }
}
