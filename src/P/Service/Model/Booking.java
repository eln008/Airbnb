package P.Service.Model;

public class Booking {
    private static int idd;

    private User bookUsers;
    private Announcement announcements;

    public Booking(User bookUsers, Announcement announcements) {
        this.bookUsers = bookUsers;
        this.announcements = announcements;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Booking.idd = idd;
    }

    public User getBookUsers() {
        return bookUsers;
    }

    public void setBookUsers(User bookUsers) {
        this.bookUsers = bookUsers;
    }

    public Announcement getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(Announcement announcements) {
        this.announcements = announcements;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "\nbookUsers=" + bookUsers +
                ", \nannouncements=" + announcements +
                "\n}";
    }

}
