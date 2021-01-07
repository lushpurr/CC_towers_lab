import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> conferenceGuests;
    private String name;


    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.conferenceGuests = new ArrayList<Guest>();
        this.name = name;
    }
}
