package airbnb;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        User user=new User("nuriza", "zununova", "nnuriza@gmail.com", LocalDate.of(2000, 2, 3));
        User user1=new User("diana", "amanova", "diana@gmail.com", LocalDate.of(2000, 1, 3));
        User [] users={user, user1};


        Address address=new Address("Bishkek", "North","Ak Orgo");
        Address address1=new Address("Talas", "North2", "Peaksoft 55");
        Address [] addresses={address, address1};

        Announcements announcements=new Announcements("My home", "Sarai", "House", user, false, -1, 100, address);
        Announcements announcements1=new Announcements("Your home", "Hotel", "Apartment", user1, true,  1, 1000, address1);
        Announcements announcements2=new Announcements("Alina home", "Sarai", "House", user, false, 2, 10, address);
        Announcements [] an={announcements, announcements1,announcements2};




        Booking booking=new Booking(user, announcements);
        Booking []booking1={booking};
        BookService bookService=new BookService(booking1);
        UserService userService=new UserService(an);
        AnnouncementService announcementService=new AnnouncementService(an);





        System.out.println("This is user service");
        System.out.println("1. Get all User");
        System.out.println("2. Get announcement by address");
        System.out.println("3. Get announcement by user id");
        System.out.println("-------------------------------");
        System.out.println("This is announcement service");
        System.out.println("4. Get announcement by id");
        System.out.println("5. Get all announcements");
        System.out.println("6. Delete announcement by id");
        System.out.println("7. Update announcement by id");
        System.out.println("8. Sort by price");
        System.out.println("9. Sort announcement by rating");
        System.out.println("10. Filter by type");
        System.out.println("11. isBooked");
        System.out.println("--------------------------------");
        System.out.println("This is booking service");
        System.out.println("12. Book the apartment");
        System.out.println("13. Unbooked the apartment");


        Scanner scanner=new Scanner(System.in);
        while (true){
            int num=scanner.nextInt();
            switch (num){
                case 1:
                    try {
                        userService.getAllUser();
                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage()); //this method will throw exception if rating of announcements is less than 0;;
                    }

                    break;
                case 2:
                    userService.getAnnouncementsByAddress(address);
                    break;
                case 3:
                    userService.getAnnouncementsByUserId(1);
                    break;
                case 4:
                    announcementService.getAnnouncementById(0);
                    break;
                case 5:
                    announcementService.getAllAnnouncements();
                    break;
                case 6:
                    System.out.println(announcementService.deleteAnnouncement(1));
                    break;
                case 7:
                    announcementService.updateAnnouncementById(0, "New Text");
                    break;
                case 8:
                    System.out.println(Arrays.toString(announcementService.sortByPrice()));
                    break;
                case 9:
                    System.out.println(Arrays.toString(announcementService.sortAnnouncementsByRating()));
                    break;
                case 10:
                    Scanner scanner1=new Scanner(System.in);
                    System.out.println("Put type of announcement: "+"House");
                    String name=scanner1.next();
                    announcementService.filterByType("House");
                    System.out.println("Put type of announcement: "+"Apartment");
                    String name2=scanner1.next();
                    announcementService.filterByType("Apartment");
                    break;
                case 11:
                    announcementService.isBooked();
                    break;
                case 12:
                    bookService.bookAnnouncement(true, announcements);
                    break;
                case 13:
                    bookService.unBookAnnouncement(false,announcements );
            }
        }











      /*bookService.bookAnnouncement(announcements, user);
      bookService.bookAnnouncement(announcements, user1);
      System.out.println("--------------------------------");
      bookService.unBookAnnouncement(announcements, user1);


        System.out.println("-----------------------------------------------------------------");
        AnnouncementService announcementService=new AnnouncementService(an);
        announcementService.isBooked();


        /*UserService userService=new UserService(users);
        System.out.println(Arrays.toString(userService.getAllUser()));

        System.out.println(Arrays.toString(userService.getAnnouncementsByUserId(1)));

        //
       //

        //announcementService.getAllAnnouncements();
       /*



        System.out.println("-------------------------------");


        */
        /*System.out.println("-------------------------------");

        System.out.println("------------------------------------------------");




         */

        //

    }
}