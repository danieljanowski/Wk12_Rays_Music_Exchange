package stock;

import behaviours.ISell;

public class Strings implements ISell {

    public String description() {
        return "Strings";
    }

    public double priceBuy() {
        return 10.00;
    }

    public double priceSell() {
        return 12.00;
    }
}
