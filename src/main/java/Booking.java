import java.util.ArrayList;

public class Booking {

    private Bedroom bookedBedroom;
    private int numberNightsBooked;

    public Booking(Bedroom bookedBedroom, int numberNightsBooked){
        this.bookedBedroom = bookedBedroom;
        this.numberNightsBooked = numberNightsBooked;
    }


    public Bedroom getRoom() {
        return bookedBedroom;
    }
}
