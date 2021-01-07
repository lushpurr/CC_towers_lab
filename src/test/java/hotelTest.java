import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class hotelTest {
    Hotel hotel;
    Bedroom bedroom;
    Booking booking;

    @Before
    public void setUp(){
        hotel = new Hotel();
        bedroom = new Bedroom(1, 1, "Single");

    }

    @Test
    public void checkBedroomListIsEmpty(){
        assertEquals(0, hotel.roomCount());
    }

    @Test
    public void canAddRoomToBedroomList(){
        hotel.addRoomToBedroomList(bedroom);
        assertEquals(1, hotel.roomCount());
    }

    @Test
    public void canBookRoom(){
        booking = hotel.bookRoom(bedroom, 7);
        assertEquals(bedroom, booking.getRoom());

    }

}
