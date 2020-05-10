package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberStrings;
    private String guitarType;

    public Guitar(String material, String colour, String type, int numberStrings, String guitarType) {
        super(material, colour, type);
        this.numberStrings = numberStrings;
        this.guitarType = guitarType;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public String play() {
        return "string, string";
    }

    public String description() {
        return "Guitar";
    }

    public double priceBuy() {
        return 200;
    }

    public double priceSell() {
        return 299;
    }
}
