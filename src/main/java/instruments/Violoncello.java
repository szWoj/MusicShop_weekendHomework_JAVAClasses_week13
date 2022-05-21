package instruments;

public class Violoncello extends Instrument implements IPlay, ISell {

    private String bowType;
    private int numberOfStrings;

    public Violoncello(String material, String colour, String brand, double wholeSalePrice,
                       double shopPrice, InstrumentType type, String bowType, int numberOfStrings) {
        super(material, colour, brand, wholeSalePrice, shopPrice, type);
        this.bowType = bowType;
        this.numberOfStrings = numberOfStrings;
    }


    public String play() {
        return "Violl violl";
    }


    public double calculateMarkUp() {
        double difference = getShopPrice()-getWholeSalePrice();
        double markup = (difference/getWholeSalePrice()*100.0);
        return markup;
    }
}
