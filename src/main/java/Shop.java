import instruments.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private double wallet;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.wallet = 0;

    }

    public int countStock() {
        return stock.size();
    }

    public double getWallet() {
        return wallet;
    }

    public void addItemToStock(ISell item) {
        stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        stock.remove(item);
    }

    public void clearStock() {
        stock.clear();
    }
}
