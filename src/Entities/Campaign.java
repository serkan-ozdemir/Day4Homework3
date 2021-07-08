package Entities;

import java.time.LocalDate;

public class Campaign {
    private int campaignID;
    private String campaignName;
    private int campaignDiscount; // percent
    private LocalDate campaignStartDate;
    private LocalDate campaignFinishDate;

    public Campaign(int campaignID, String campaignName, int campaignDiscount, LocalDate campaignStartDate, LocalDate campaignFinishDate) {
        this.campaignID = campaignID;
        this.campaignName = campaignName;
        this.campaignDiscount = campaignDiscount;
        this.campaignStartDate = campaignStartDate;
        this.campaignFinishDate = campaignFinishDate;
    }

    public int getCampaignID() {
        return campaignID;
    }

    public void setCampaignID(int campaignID) {
        this.campaignID = campaignID;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getCampaignDiscount() {
        return campaignDiscount;
    }

    public void setCampaignDiscount(int campaignDiscount) {
        this.campaignDiscount = campaignDiscount;
    }

    public LocalDate getCampaignStartDate() {
        return campaignStartDate;
    }

    public void setCampaignStartDate(LocalDate campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }

    public LocalDate getCampaignFinishDate() {
        return campaignFinishDate;
    }

    public void setCampaignFinishDate(LocalDate campaignFinishDate) {
        this.campaignFinishDate = campaignFinishDate;
    }
}
