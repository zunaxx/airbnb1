package airbnb;

public interface AnnouncementInterface {
    String deleteAnnouncement(int id);
    void updateAnnouncementById(int id, String newText);
    Announcements getAnnouncementById(int id);
    Announcements[] getAllAnnouncements();
    Announcements[] sortAnnouncementsByRating();
    Announcements [] sortByPrice();
    void filterByType(String type);
    void isBooked();
}

