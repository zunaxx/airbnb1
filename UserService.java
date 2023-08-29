package airbnb;

import java.util.Arrays;

public class UserService implements UserInterface {


    private Announcements[] announcements;

    public UserService(Announcements[] announcements) {
        this.announcements = announcements;
    }

    @Override
    public Announcements getAnnouncementsByUserId(int id) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getUser().getInstanceId() == id) {
                System.out.println(announcements[i]);
            }
        }
        return null;
    }


    @Override
    public User[] getAllUser() throws Exception {
        try{
            for(int i=0; i<announcements.length; i++){
                if(announcements[i].getRating()<0){
                    throw new RuntimeException();
                }
                System.out.println(announcements[i].getUser());
            }
        }catch (RuntimeException e){
            System.out.println("there is something went wrong");
        }
        return null;
    }


    @Override
    public Announcements getAnnouncementsByAddress(Address address) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getAddress().equals(address)) {
                System.out.println(announcements[i]);
            }
        }
        return null;

    }
}
