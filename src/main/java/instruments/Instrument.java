package instruments;

public abstract class Instrument{
    private String material;
    private String colour;
    private String brand;
    private double wholeSalePrice;
    private double shopPrice;
    private InstrumentType type;


    public Instrument(String material, String colour, String brand,
                      double wholeSalePrice, double shopPrice, InstrumentType type) {
        this.material = material;
        this.colour = colour;
        this.brand = brand;
        this.wholeSalePrice = wholeSalePrice;
        this.shopPrice = shopPrice;
        this.type = type;
    }

    public double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public double getShopPrice() {
        return shopPrice;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setShopPrice(double shopPrice) {
        this.shopPrice = shopPrice;
    }
}
