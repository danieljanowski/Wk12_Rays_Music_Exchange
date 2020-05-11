package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int numberKeys;
    private String size;
    private String description;
    private double priceBuy;
    private double priceSell;

    public Piano(String material, String colour, String type, int numberKeys, String size, String description, double priceBuy, double priceSell) {
        super(material, colour, type);
        this.numberKeys = numberKeys;
        this.size = size;
        this.description = description;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }

    public int getNumberKeys() {
        return numberKeys;
    }

    public String getSize() {
        return size;
    }

    public String play() {
        return "Plink plink";
    }

    public String description() {
        return "Grand Piano";
    }

    public double priceBuy() {
        return priceBuy;
    }

    public double priceSell() {
        return priceSell;
    }
}
