package codexo.shopEx;

public class MarketingSpecialist {

    private final Shop shop;
    private double budget = 5000.00;

    public MarketingSpecialist(Shop shop, double budget) {
        this.shop = shop;
        this.budget = budget;
    }

    public void spendMoney(double marketingCampaignCost) {
        this.budget -= Math.max(marketingCampaignCost, 0);
    }

    public double getBudget() {
        return this.budget;
    }

    public double getMarketingSpecialistTurnover() {
        double turnOver = 0.0;
        turnOver += getBudget();
        return turnOver;
    }

}
