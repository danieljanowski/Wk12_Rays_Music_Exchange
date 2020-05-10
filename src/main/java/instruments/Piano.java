package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

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
}
