package codexo.shopEx;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private static Shop shop;
    private final List<Workers> workers;

    public Shop() {
        this.workers= new ArrayList<>();
    }

    public static Shop getShop() {
        if (shop == null) {
            shop = new Shop();
        }
        return shop;
    }

    public void addWorker(Workers worker) {
        this.workers.add(worker);
    }
}
