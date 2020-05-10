package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int numberKeys;
    private String size;

    public Piano(String material, String colour, String type, int numberKeys, String size) {
        super(material, colour, type);
        this.numberKeys = numberKeys;
        this.size = size;
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
        return 8000;
    }

    public double priceSell() {
        return 10000;
    }
}
