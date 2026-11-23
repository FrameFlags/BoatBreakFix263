package itamio.boatbreakfix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoatBreakFixLogicTest {
    @Test void preventsDangerousFall() {
        assertTrue(BoatBreakFixLogic.shouldPreventBreak(12.0f, true));
        assertFalse(BoatBreakFixLogic.shouldPreventBreak(12.0f, false));
        assertFalse(BoatBreakFixLogic.shouldPreventBreak(1.0f, true));
    }
    @Test void dropsBoat() {
        assertEquals(1, BoatBreakFixLogic.dropCount(0));
        assertEquals(2, BoatBreakFixLogic.dropCount(2));
    }
}
