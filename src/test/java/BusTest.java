import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Person person;
    Bus bus;

    @Before
    public void before() {
        person = new Person();
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
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void canAddPassengerCapacityFull() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.getPassengerCount());
    }


}
