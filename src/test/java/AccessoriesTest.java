import org.junit.Before;
import org.junit.Test;
import otherItems.Accessories;
import otherItems.AccessoriesType;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    Accessories guitarStrings;
    Accessories drumSticks;
    Accessories sheetMusic;

    @Before
    public void before() {
        guitarStrings = new Accessories(AccessoriesType.GUITARSTRING, 50.0, 80.0);
        drumSticks = new Accessories(AccessoriesType.DRUMSTICKS, 20.0, 70.0);
        sheetMusic = new Accessories(AccessoriesType.MUSICSHEET, 15.0, 35.0);
    }

    @Test
    public void accessoriesHasMarkups() {
        assertEquals(60.00, guitarStrings.calculateMarkUp(), 0.0);
        assertEquals(250.0, drumSticks.calculateMarkUp(), 0.0);
        assertEquals(133.3, sheetMusic.calculateMarkUp(), 0.1);


    }


}
