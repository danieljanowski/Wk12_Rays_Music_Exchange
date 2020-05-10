package stock;

import behaviours.ISell;

public class Strings implements ISell {

    private String description;
    private double priceBuy;
    private double priceSell;

    public Strings(String description, double priceBuy, double priceSell) {
        this.description = description;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }

    public String description() {
        return description;
    }

    public double priceBuy() {
        return priceBuy;
    }

    public double priceSell() {
        return priceSell;
    }

}
