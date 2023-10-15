import java.awt.print.Book;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        test01();

        System.out.println("End OK.");

    }

    private static List<Guest> guestList(Guest... args){
        List<Guest> newGuestList = new ArrayList<>();
        Collections.addAll(newGuestList, args);
        return newGuestList;
    }

    private static void test01() {
        System.out.println("---------\nStart of test01 method");
        ListOfBookings myBookings = new ListOfBookings();

        Guest guest1 = new Guest("Adéla",
                "Malíková",
                LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan",
                "Dvořáček",
                LocalDate.of(1995, 5,5));
        System.out.println(guest1+"\n"+guest2);

        Room room1 = new Room(1, 1, true, true,
                BigDecimal.valueOf(1000));
        Room room2 = new Room(2, 1, true, true,
                BigDecimal.valueOf(1000));
        Room room3 = new Room(3, 3, false, true,
                BigDecimal.valueOf(1000));

        List<Guest> guestList1 = guestList(guest1);
        myBookings.add(room1, guestList1,
                LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26));

        List<Guest> guestlist2 = guestList(guest1, guest2);
        myBookings.add(room3, guestlist2,
                LocalDate.of(2021,9,1),
                LocalDate.of(2021, 9, 14));
        myBookings.add(room2, guestList1);

        System.out.println("\nAll current reservations:");
        System.out.print(myBookings);
        System.out.println("\nEnd of test01 method\n---------");

    }

}