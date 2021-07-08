package Adaptors;

import Abstract.UserCheckService;
import Entities.User;
import Mernis.TNQKPSPublicSoap;

import java.util.Locale;

public class MernisServiceCheck implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(User user) {
        TNQKPSPublicSoap client = new TNQKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalID()), user.getUserName().toUpperCase(new Locale("tr")), user.getUserLastName().toUpperCase(new Locale("tr")), user.getBirthDate().getYear());
        } catch (Exception e) {
            return false;
        }
    }
}
