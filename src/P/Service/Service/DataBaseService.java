package P.Service.Service;

import P.Service.Model.User;

public class DataBaseService {
    private DataBaseService dataBaseService;

    public DataBaseService(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public DataBaseService() {

    }
    public User[] getAllUser() {
        return dataBaseService.getAllUser();
    }


}

