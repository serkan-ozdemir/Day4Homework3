package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {
    @Override
    public void sale(User user, Game game) {
        System.out.println(game.getGameName()+" sold to " + user.getUserName() + " Price : " + game.getGamePrice());
    }

    @Override
    public void saleWithCampaign(User user, Game game, Campaign campaign) {
        System.out.println(game.getGameName() + " sold to " + user.getUserName() + " Price : " + game.getGamePrice()*((100-campaign.getCampaignDiscount())/100.0));
    }
}
