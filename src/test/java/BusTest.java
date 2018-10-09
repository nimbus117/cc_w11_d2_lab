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
}
