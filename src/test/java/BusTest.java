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

    @Test
    public void busCanTakePassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busIsFull(){
       Bus bus1 = new Bus("Bruntsfield", 1);
        Person person1 = new Person();
        Person person2 = new Person();
        bus1.addPassenger(person1);
        bus1.addPassenger(person2);
        assertEquals(1, bus1.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());

    }
}
