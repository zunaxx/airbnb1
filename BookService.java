package airbnb;

import java.util.Arrays;

public class BookService implements BookingInterface {


    public Booking[] bookings;


    public BookService(Booking[] bookings) {
        this.bookings = bookings;
    }




    @Override
    public void unBookAnnouncement(boolean isBooked, Announcements announcements) {
        for(int i=0; i<bookings.length; i++){
            bookings[i].getAnnouncement().setBooked(isBooked);//by this formula I will set all booked apartments to unbooked (Shortly i will update the boolean "isBooked=true" to "isBooked-false");
            System.out.println("I made this apartment free"+announcements);
        }
    }

    public void  bookAnnouncement(boolean isBooked, Announcements announcements) {
        for(int i=0; i<bookings.length; i++) {
            bookings[i].getAnnouncement().setBooked(isBooked);//by this formula I will set all free apartments to booked
            System.out.println("I rent this apartment"+announcements);
        }
    }
}








