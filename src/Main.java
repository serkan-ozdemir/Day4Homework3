import Adaptors.MernisServiceCheck;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Game game1 = new Game("Desperados 3", 1 , 100);
        User user1 = new User(1,"Serkan","Özdemir","1234568910",LocalDate.of(1998,2,9));
        Campaign campaign1 = new Campaign(1,"SummerSale" , 40 , LocalDate.of(2021,7,5),LocalDate.of(2021,8,10)) ;

        GameManager gameManager = new GameManager();
        UserManager userManager = new UserManager(new MernisServiceCheck());
        CampaignManager campaignManager = new CampaignManager();
        SaleManager saleManager = new SaleManager();

        ////////////TEST//////////
        userManager.add(user1);
        userManager.update(user1);
        userManager.delete(user1);

        campaignManager.add(campaign1);
        campaignManager.update(campaign1);
        campaignManager.delete(campaign1);

        gameManager.add(game1);
        gameManager.update(game1);
        gameManager.delete(game1);


        saleManager.sale(user1,game1);
        saleManager.saleWithCampaign(user1,game1,campaign1);
    }
}
