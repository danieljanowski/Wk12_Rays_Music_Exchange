import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void add(ISell item){
        stock.add(item);
    }

    public void remove(ISell item){
        stock.remove(item);
    }

    public int countStock(){
        return stock.size();
    }

    public double calculateMarkup(ISell item) {
        return item.priceSell() - item.priceBuy();
    }

    public double totalProfit() {
        double total = 0.00;
        for (ISell item : stock) {
            total += this.calculateMarkup(item);
        }
        return total;
    }
}
