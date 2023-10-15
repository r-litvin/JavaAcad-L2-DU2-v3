import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> listOfBookings = new ArrayList<>();

    public void add(Room room, List<Guest> guests, LocalDate stayStart, LocalDate stayEnd){
        Booking newBooking = new Booking(room, guests, stayStart, stayEnd);
        this.listOfBookings.add(newBooking);
    }

    public void add(Room room, List<Guest> guests, LocalDate stayStart, LocalDate stayEnd, VacationType vacationType){
        Booking newBooking = new Booking(room, guests, stayStart, stayEnd, vacationType);
        this.listOfBookings.add(newBooking);
    }

    public void add(Room room, List<Guest> guests){
        Booking newBooking = new Booking(room, guests);
        this.listOfBookings.add(newBooking);
    }

    public void add(Booking newBooking){
        this.listOfBookings.add(newBooking);
    }

    public void remove(Booking oldBooking){
        this.listOfBookings.remove(oldBooking);
    }

    public String toString(){
        String outputString = "";
        for (Booking booking : this.listOfBookings){
            outputString += booking.toString() + "\n";
        }
        return outputString;
    }
}
