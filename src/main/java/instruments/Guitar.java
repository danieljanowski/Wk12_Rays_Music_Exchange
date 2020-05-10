package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

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
}
