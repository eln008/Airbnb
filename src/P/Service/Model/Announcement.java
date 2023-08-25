package P.Service.Model;

import P.Service.Enum.TypeHouse;

import java.time.LocalDate;

public class Announcement {
    private static int idd;
    private  int id;
    private String description;
    private LocalDate date;
    private String title;
    private TypeHouse typeHouse;
    private String owner;  //setUser
    private boolean isBooked;
    private int rating;
    private int pricePerDay;
    private Address address;



    public Announcement(int id, String description, LocalDate date, String title, TypeHouse typeHouse, String owner, boolean isBooked, int rating, int pricePerDay, Address address) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.title = title;
        this.typeHouse = typeHouse;
        this.owner = owner;
        this.isBooked = isBooked;
        this.rating = rating;
        this.pricePerDay = pricePerDay;
        this.address = address;


    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Announcement.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TypeHouse getTypeHouse() {
        return typeHouse;
    }

    public void setTypeHouse(TypeHouse typeHouse) {
        this.typeHouse = typeHouse;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "\nid=" + id +
                ", \ndescription='" + description + '\'' +
                ", \ndate=" + date +
                ", \ntitle='" + title + '\'' +
                ", \ntypeHouse=" + typeHouse +
                ", \nowner='" + owner + '\'' +
                ", \nisBooked=" + isBooked +
                ", \nrating=" + rating +
                ", \npricePerDay=" + pricePerDay +
                ", \naddress=" + address +
                "\n}";
    }

}
