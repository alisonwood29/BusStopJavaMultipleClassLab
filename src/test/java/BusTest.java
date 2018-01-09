import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before(){
        bus = new Bus("Granton", 60);
        person = new Person();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
}
