package codexo.shopEx;

public class SalesConsultant {

    private final Shop shop;
    private double earnedMoney;

    public SalesConsultant(Shop shop, double earnedMoney) {
        this.shop = shop;
        this.earnedMoney = earnedMoney;
    }


    public double getEarnedMoney() {
        return earnedMoney;
    }

    public void sellProduct(double price) {
        this.earnedMoney += Math.max(price, 0);
    }

    public double getSalesConsultTurnover() {
        double turnOver = 0.0;
        turnOver += getEarnedMoney();
        return turnOver;
    }
}
