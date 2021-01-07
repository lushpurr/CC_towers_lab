import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class bedroomTest {
    Bedroom bedroom;
    Bedroom bedroom2;
    Guest guest1;

    @Before
    public void setUp(){
        bedroom = new Bedroom(1, 1, "Single");
        bedroom2 = new Bedroom(1, 1, "Single");
        guest1 = new Guest("Jim");


    }

    @Test
    public void checkRoomIsEmpty(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertFalse(bedroom.getGuests().contains(guest1));
        assertEquals(0, bedroom.guestCount());
    }



}
