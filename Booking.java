package airbnb;

public class Booking {



    private User user;
    private Announcements announcement;

    public Booking(User user, Announcements announcement) {
        this.user = user;
        this.announcement = announcement;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Announcements getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcements announcement) {
        this.announcement = announcement;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "user=" + user +
                ", announcement=" + announcement +
                '}';
    }
}