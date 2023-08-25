package P.Service.Model;

import java.util.Arrays;

public class DataBase {
    private User[] users;
    private Booking booking;
    private Announcement[] announcements;

    public DataBase() {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Announcement[] getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(Announcement[] announcements) {
        this.announcements = announcements;
    }

    @Override
    public String toString() {
        return "DataBaseForUser{" +
                "\n  users=" + Arrays.toString(users) +
                "\n}";
    }

}
