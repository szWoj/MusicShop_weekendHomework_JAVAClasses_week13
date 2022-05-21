import instruments.*;
import org.junit.Before;
import org.junit.Test;
import otherItems.Accessories;
import otherItems.AccessoriesType;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar1;
    Guitar guitar2;
    Piano piano;
    Trumpet trumpet;
    Violoncello violoncello;
    Accessories guitarStrings;
    Accessories drumSticks;
    Accessories sheetMusic;

    @Before
    public void before() {
        shop = new Shop("My Music Shop PLAY");
        guitar1 = new Guitar("fake wood", "black", "Kadence", 100.0, 300.0, InstrumentType.STRINGS, 5, false, "electric" );
        guitar2 = new Guitar("wood", "blue", "Ibanez", 200.0, 600.0, InstrumentType.STRINGS, 7, true, "classical");
        piano = new Piano("wood", "brown", "Yamaha", 500.0, 1000.0, InstrumentType.KEYBOARD, "classic");
        trumpet = new Trumpet("silver", "silver", "Hertz", 400.0, 700.0, InstrumentType.BRASS, 4);
        violoncello = new Violoncello("wood", "dark brown", "Stagg", 300.0, 700.0, InstrumentType.WOODWIND, "horse",5);
        guitarStrings = new Accessories(AccessoriesType.GUITARSTRING, 50.0, 80.0);
        drumSticks = new Accessories(AccessoriesType.DRUMSTICKS, 20.0, 70.0);
        sheetMusic = new Accessories(AccessoriesType.MUSICSHEET, 15.0, 35.0);
    }

    @Test
    public void StockIsEmpty() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddtoStock() {
        shop.addItemToStock(guitar1);
        shop.addItemToStock(guitarStrings);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canClearStock() {
        shop.addItemToStock(guitar2);
        shop.addItemToStock(trumpet);
        assertEquals(2, shop.countStock());
        shop.clearStock();
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitar2);
        shop.addItemToStock(trumpet);
        assertEquals(2, shop.countStock());
        shop.removeItemFromStock(trumpet);
        assertEquals(1, shop.countStock());

    }
}
