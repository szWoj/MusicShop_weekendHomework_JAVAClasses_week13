package instruments;



public class Piano extends Instrument implements IPlay, ISell {
    private String pianoType;

    public Piano(String material, String colour, String brand, double wholeSalePrice,
                 double shopPrice, InstrumentType type, String pianoType) {
        super(material, colour, brand, wholeSalePrice, shopPrice, type);
        this.pianoType = pianoType;
    }

    @Override
    public String play() {
        return "Klick klick klick";
    }

    public double calculateMarkUp() {

        double difference = getShopPrice()-getWholeSalePrice();
        double markup = (difference/getWholeSalePrice()*100.0);
        return markup;
    }
}
