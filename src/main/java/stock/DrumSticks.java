package stock;

import behaviours.ISell;

public class DrumSticks implements ISell {
    public String description() {
        return "Drum Sticks";
    }

    public double priceBuy() {
        return 20;
    }

    public double priceSell() {
        return 24;
    }
}
