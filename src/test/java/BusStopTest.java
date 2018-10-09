import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;

    @Before
    public void before() {
        busStop = new BusStop("Leith");
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("Leith", busStop.getName());
    }

    @Test
    public void hasQueue() {
        assertEquals(0, busStop.getQueueCount());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPersonToQueue(person1);
        assertEquals(1, busStop.getQueueCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPersonToQueue(person1);
        busStop.addPersonToQueue(person2);
        busStop.removePersonFromQueue(person1);
        assertEquals(1, busStop.getQueueCount());
    }
}
