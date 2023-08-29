package airbnb;

import java.util.Arrays;

public class AnnouncementService implements AnnouncementInterface {


    private Announcements[] announcements;

    public AnnouncementService(Announcements[] announcements) {
        this.announcements = announcements;
        for (int i = 0; i < announcements.length; i++) {
            announcements[i].setInstanceId(i + 1 - 1);
        }
    }




    @Override
    public String deleteAnnouncement(int id) {
        int indexToRemove = -1;
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getInstanceId() == id) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            Announcements[] newAnnouncement = new Announcements[announcements.length - 1];
            int j = 0;
            for (int i = 0; i < announcements.length; i++) {
                if (i != indexToRemove) {
                    newAnnouncement[j] = announcements[i];
                    j++;
                    announcements[i].setInstanceId(j);
                }
            }
            announcements = Arrays.copyOf(newAnnouncement, newAnnouncement.length);
            System.out.println(Arrays.toString(announcements));
            return "Deleted";
        }
        return "Not found";
    }





    @Override
    public void filterByType(String type) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getType().equals(type)) {
                System.out.println(announcements[i]);
            }
        }}




    @Override
    public void updateAnnouncementById(int id, String newText) {
        for (Announcements ana : announcements) {
            if(ana.getInstanceId()==id){
                ana.setDescription(newText);
                System.out.println(ana);
            }}}




    @Override
    public Announcements getAnnouncementById(int id) {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i].getInstanceId() == id) {
                System.out.println(Arrays.toString(announcements));
            }
        }
        return null;
    }



    @Override
    public Announcements[] getAllAnnouncements() {
        for (int i = 0; i < announcements.length; i++) {
            System.out.println(announcements[i]);

        }
        return announcements;
    }




    @Override
    public Announcements[] sortAnnouncementsByRating() {
        for (int i = 0; i < announcements.length; i++) {
            for (int j = i + 1; j < announcements.length; j++) {
                if (announcements[i].getRating() > announcements[j].getRating()) {
                    Announcements temp = announcements[i];
                    announcements[i] = announcements[j];
                    announcements[j] = temp;
                }}}
        return announcements;

    }



    @Override
    public Announcements[] sortByPrice() {
        for (int i = 0; i < announcements.length; i++) {
            for (int j = i + 1; j < announcements.length; j++) {
                if (announcements[i].getPricePerDay() > announcements[j].getPricePerDay()) {
                    Announcements temp = announcements[i];
                    announcements[i] = announcements[j];
                    announcements[j] = temp;
                    // System.out.println(temp);
                }}}
        return announcements;
    }



    @Override
    public void isBooked() {
        for (Announcements announcement : announcements) {
            System.out.println(announcement + (announcement.isBooked() ? " - Booked" : " - Still free"));
        }
    }
}








