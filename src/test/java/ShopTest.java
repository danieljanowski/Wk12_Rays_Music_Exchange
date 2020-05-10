import behaviours.ISell;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import stock.Strings;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    ISell grandPiano;
    ISell strings;

    @Before
    public void before(){
        shop = new Shop();
        grandPiano = new Piano("wood","black","piano",129,"grand piano");
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
}
