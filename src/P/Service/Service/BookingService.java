package P.Service.Service;

import P.Service.Interface.BookingInterface;
import P.Service.Model.Announcement;
import P.Service.Model.Booking;
import P.Service.Model.DataBase;

public class BookingService implements BookingInterface {
    DataBase dataBase = new DataBase();

    public BookingService(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    @Override
    public Announcement bookAnnouncement(Announcement announcement) {
        for (Announcement a : dataBase.getAnnouncements()) {
            if (a.equals(announcement)) {
                if (!a.isBooked()) {
                    a.setBooked(true);
                    return a;
                }            }
        }

        return null;
    }

    @Override
    public Announcement unBookAnnouncement(Announcement announcement) {
        for (Announcement a : dataBase.getAnnouncements()) {
            if(a.equals(announcement)){
                if (a.isBooked()){
                    a.setBooked(false);
                    return a;
                }
            }
        }
        return null;
    }
}
