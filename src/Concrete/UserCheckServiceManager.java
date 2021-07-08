package Concrete;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckServiceManager implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(User user) {
        return false;
    }
}
