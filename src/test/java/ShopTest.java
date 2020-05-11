import behaviours.ISell;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import stock.Strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {
    Shop shop;
    ISell grandPiano;
    ISell strings;

    @Before
    public void before(){
        shop = new Shop();
        grandPiano = new Piano("wood","black","piano",129,"grand piano", "Grand Piano", 8000.00, 10000.00);
        strings = new Strings("Classic Guitar Strings",10.00,12.00);
    }

    @Test
    public void canAddStock(){
        shop.add(grandPiano);
        assertEquals(1, shop.countStock());
        shop.add(strings);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canRemoveStock(){
        shop.add(grandPiano);
        shop.add(strings);
        assertEquals(2, shop.countStock());
        shop.remove(grandPiano);
        assertEquals(1, shop.countStock());
        shop.remove(grandPiano);
        assertEquals(1, shop.countStock());
        shop.remove(strings);
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canCalculateMarkup(){
        shop.add(grandPiano);
        assertEquals(2000.00, shop.calculateMarkup(grandPiano), 0.01);
    }

    @Test
    public void canCalculateTotalProfit(){
        shop.add(grandPiano);
        shop.add(strings);
        assertEquals(2002.00, shop.totalProfit(), 0.01);
    }
}
