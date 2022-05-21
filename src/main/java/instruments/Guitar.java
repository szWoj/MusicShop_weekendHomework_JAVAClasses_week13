package instruments;

import instruments.Instrument;

public class Guitar extends Instrument implements IPlay, ISell{

    private int numberOfStrings;
    private boolean leftHanded;
    private String guitarType;

    public Guitar(String material, String colour, String brand, double wholeSalePrice,
                  double shopPrice, InstrumentType type, int numberOfStrings, boolean leftHanded,
                  String guitarType) {
        super(material, colour, brand, wholeSalePrice, shopPrice, type);
        this.numberOfStrings = numberOfStrings;
        this.leftHanded = leftHanded;
        this.guitarType = guitarType;
    }

    public String play(){
        return "Class Clacc Class";
    }

    public boolean isLeftHanded() {
        return leftHanded;
    }

    public void getGuitarPrice() {
        if (isLeftHanded() == false ) {
            double RightHandedPrice = getShopPrice()*0.8;
            setShopPrice(RightHandedPrice);
        }
    }


    public double calculateMarkUp() {
        getGuitarPrice();
        double difference = getShopPrice()-getWholeSalePrice();
        double markup = (difference/getWholeSalePrice()*100.0);
        return markup;
    }
}
