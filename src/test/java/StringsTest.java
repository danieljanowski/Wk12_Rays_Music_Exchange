import org.junit.Before;
import org.junit.Test;
import stock.Strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StringsTest {
    private Strings strings;

    @Before
    public void before(){
        strings = new Strings("Classic Guitar Strings",10.00,12.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("Classic Guitar Strings", strings.description());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(12.00, strings.priceSell(), 0.01);
    }
}
