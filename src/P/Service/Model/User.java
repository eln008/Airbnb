package P.Service.Model;

import java.time.LocalDate;
import java.util.Arrays;

public class User {
    private static int idd;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate registeredDate;
    private Announcement[] announcements;


    public User(int id, String firstName, String lastName, String email, LocalDate registeredDate, Announcement[] announcements) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.registeredDate = registeredDate;
        this.announcements=announcements;
    }


    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        User.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Announcement[] getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(Announcement[] announcements) {
        this.announcements = announcements;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "\nid=" + id +
                ", \nfirstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \nemail='" + email + '\'' +
                ", \nregisteredDate=" + registeredDate +
                ", \nannouncements=" + Arrays.toString(announcements) +
                '}' + "\n";
    }

}
