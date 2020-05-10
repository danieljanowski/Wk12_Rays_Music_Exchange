package instruments;

import behaviours.IPlay;

public abstract class Instrument {
    private String material;
    private String colour;
    private String type;

    public Instrument(String material, String colour, String type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}
