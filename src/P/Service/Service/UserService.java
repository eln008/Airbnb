package P.Service.Service;

import P.Service.Interface.UserInterface;
import P.Service.Model.Address;
import P.Service.Model.Announcement;
import P.Service.Model.User;

public class UserService implements UserInterface {
    private DataBaseService dataBaseService;

    public UserService(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    @Override
    public User[] getAllUser() {
        return dataBaseService.getAllUser();
    }


    @Override
    public Announcement[] getAnnouncementByUserId(long id) {
        for (User u: getAllUser()) {
            if(u.getId()==id){
                return u.getAnnouncements();
            }
        }
        return null;
    }

    @Override
    public Announcement[] getAnnouncementByAddress(Address inputAddress) {
        for (User u: getAllUser()) {

            for (int i = 0; i <u.getAnnouncements().length ; i++) {
                if (u.getAnnouncements()[i].getAddress().equals(inputAddress)){
                    return u.getAnnouncements();
                }}
        }
        return null;
    }
}

