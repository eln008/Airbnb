package P.Service.Model;

import java.util.Arrays;

public class DataBase {
    private User[] users;
    private Booking booking;
    private Announcement[] announcements;

    public DataBase(User[] users, Booking booking, Announcement[] announcements) {
        this.users = users;
        this.booking = booking;
        this.announcements = announcements;
    }

    public DataBase() {

    }

    public void setAnnouncements() {
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

    public void setBooking() {
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
                ",\n  booking=" + booking +
                ",\n  announcements=" + Arrays.toString(announcements) +
                "\n}";
    }


}
