package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;


public class UserManager implements UserService {
    private UserCheckService _userCheckService;

    public UserManager(UserCheckService _userCheckService) {
        this._userCheckService = _userCheckService;
    }

    public void add(User user) {
        try {
            if (_userCheckService.checkIfRealPerson(user)){
                System.out.println("User successfully added");
            }else
                System.out.println("Not a valid Person");
        }
        catch (Exception e){
            System.out.println("Not a valid Person");
        }

    }

    @Override
    public void update(User user) {
        System.out.println("User successfully updated");
    }

    @Override
    public void delete(User user) {
        System.out.println("User successfully deleted");
    }
}
