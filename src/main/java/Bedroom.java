import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> bedroomGuests;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.bedroomGuests =new ArrayList<Guest>();
        this.roomType = roomType;
    }

    public int guestCount() {
        return this.bedroomGuests.size();
    }

    public ArrayList<Guest> getGuests(){
        return bedroomGuests;
    }

    public void addGuest(Guest guest) {
        this.bedroomGuests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.bedroomGuests.remove(guest);
    }
}
