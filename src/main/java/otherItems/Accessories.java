package otherItems;

import instruments.ISell;

public class Accessories implements ISell {
    private AccessoriesType accessoriesType;
    private double wholeSalePrice;
    private double shopPrice;

    public Accessories(AccessoriesType accessoriesType, double wholeSalePrice, double shopPrice) {
        this.accessoriesType = accessoriesType;
        this.wholeSalePrice = wholeSalePrice;
        this.shopPrice = shopPrice;
    }

    public double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public double getShopPrice() {
        return shopPrice;
    }

    @Override
    public double calculateMarkUp() {
        double difference = getShopPrice()-getWholeSalePrice();
        double markup = (difference/getWholeSalePrice()*100.0);
        return markup;
    }
}
