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
}
