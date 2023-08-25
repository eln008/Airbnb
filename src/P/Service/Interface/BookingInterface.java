package P.Service.Interface;

import P.Service.Model.Announcement;
import P.Service.Model.Booking;

public interface BookingInterface {
    Announcement bookAnnouncement(Announcement announcement);
    Announcement unBookAnnouncement(Announcement announcement);
}
