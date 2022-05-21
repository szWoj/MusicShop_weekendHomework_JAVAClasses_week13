package instruments;



public class Trumpet extends Instrument implements IPlay, ISell {
    private int numberOfValves;

    public Trumpet(String material, String colour, String brand, double wholeSalePrice,
                   double shopPrice, InstrumentType type, int numberOfValves) {
        super(material, colour, brand, wholeSalePrice, shopPrice, type);
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String play() {
        return "Trru Truuu Truuu";
    }

    public double calculateMarkUp() {

        double difference = getShopPrice()-getWholeSalePrice();
        double markup = (difference/getWholeSalePrice()*100.0);
        return markup;
    }



}


