import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Guitar guitar1;
    Guitar guitar2;
    Piano piano;
    Trumpet trumpet;
    Violoncello violoncello;

    @Before
    public void before() {
        guitar1 = new Guitar("fake wood", "black", "Kadence", 100.0, 300.0, InstrumentType.STRINGS, 5, false, "electric" );
        guitar2 = new Guitar("wood", "blue", "Ibanez", 200.0, 600.0, InstrumentType.STRINGS, 7, true, "classical");
        piano = new Piano("wood", "brown", "Yamaha", 500.0, 1000.0, InstrumentType.KEYBOARD, "classic");
        trumpet = new Trumpet("silver", "silver", "Hertz", 400.0, 700.0, InstrumentType.BRASS, 4);
        violoncello = new Violoncello("wood", "dark brown", "Stagg", 300.0, 700.0, InstrumentType.WOODWIND, "horse",5);
    }

    @Test
    public void instrumentsCanPlay() {
        assertEquals("Class Clacc Class", guitar1.play());
        assertEquals("Klick klick klick", piano.play());
        assertEquals("Trru Truuu Truuu", trumpet.play());
        assertEquals("Violl violl", violoncello.play());
    }

    @Test
    public void leftHandedPrice() {
        guitar2.getGuitarPrice();
        assertEquals(200, guitar2.getWholeSalePrice(), 0.0);
    }

    @Test
    public void rightHandedPrice() {
        guitar1.getGuitarPrice();
        assertEquals(100, guitar1.getWholeSalePrice(), 0.0);
    }

    @Test
    public void checkInstrumentMarkups() {
        assertEquals(140.0, guitar1.calculateMarkUp(), 0.0);
        assertEquals(200.00, guitar2.calculateMarkUp(), 0.0);
        assertEquals(100.00, piano.calculateMarkUp(),0.0);
        assertEquals(75.0, trumpet.calculateMarkUp(), 0.1);
        assertEquals(133.3, violoncello.calculateMarkUp(), 0.1);
    }
}
