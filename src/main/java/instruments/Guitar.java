package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberStrings;
    private String guitarType;
    private String description;
    private double priceBuy;
    private double priceSell;

    public Guitar(String material, String colour, String type, int numberStrings, String guitarType, String description, double priceBuy, double priceSell) {
        super(material, colour, type);
        this.numberStrings = numberStrings;
        this.guitarType = guitarType;
        this.description = description;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
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
        return priceBuy;
    }

    public double priceSell() {
        return priceSell;
    }
}
