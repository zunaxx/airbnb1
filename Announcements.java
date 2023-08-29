package airbnb;

public class Announcements {

    public static int id;
    private int instanceId;
    private String description;
    private String title;
    private String type;
    private User user;
    private boolean isBooked;
    private int rating;
    private int pricePerDay;
    private Address address;
    public Announcements( String description, String title, String type, User user, boolean isBooked, int rating, int pricePerDay, Address address) {
        this.instanceId = id++;
        this.description = description;
        this.title = title;
        this.type = type;
        this.user = user;
        this.isBooked = isBooked;
        this.rating = rating;
        this.pricePerDay = pricePerDay;
        this.address=address;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Announcements.id = id;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n"+"Announcements{" +
                "instanceId=" + instanceId +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                ", isBooked=" + isBooked +
                ", rating=" + rating +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}