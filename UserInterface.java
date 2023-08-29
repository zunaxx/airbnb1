package airbnb;

public interface UserInterface {


    User [] getAllUser() throws Exception;
    Announcements  getAnnouncementsByUserId(int id);
    Announcements  getAnnouncementsByAddress(Address address);



}
