package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Campaign successfully added");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Campaign successfully updated");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Campaign successfully deleted");
    }
}
