package P.Service.Service;

import P.Service.Model.DataBaseForUser;
import P.Service.Model.User;

public class DataBaseForUserService {
    private DataBaseForUser dataBaseForUser;

    public DataBaseForUserService(DataBaseForUser dataBaseForUser) {
        this.dataBaseForUser = dataBaseForUser;
    }

    public DataBaseForUserService() {

    }

    public User[] getAllUser() {
        return dataBaseForUser.getUsers();
    }

}

