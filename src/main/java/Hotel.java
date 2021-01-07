import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;


    public Hotel(){
        this.bedroomList = new ArrayList<Bedroom>();
        this.conferenceRoomList = new ArrayList<ConferenceRoom>();

    }


    public int roomCount() {
        return this.bedroomList.size();
    }

    public void addRoomToBedroomList(Bedroom bedroom) {
        this.bedroomList.add(bedroom);
    }

    public Booking bookRoom(Bedroom bedroom, int nights){
        Booking booking = new Booking(bedroom, nights);
        return booking;
    }

}
