import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano grandPiano;

    @Before
    public void before(){
        grandPiano = new Piano("wood","black","piano",129,"grand piano", "Grand Piano", 8000.00, 10000.00);
    }

    @Test
    public void pianoCanPlay(){
        assertEquals("Plink plink", grandPiano.play());
    }

}
