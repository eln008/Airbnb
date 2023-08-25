package P.Service.Interface;

import P.Service.Model.Address;
import P.Service.Model.Announcement;
import P.Service.Model.User;

public interface UserInterface {
    User[] getAllUser();
    Announcement[] getAnnouncementByUserId(long id);
    Announcement[] getAnnouncementByAddress(Address  inputAddress);
}
