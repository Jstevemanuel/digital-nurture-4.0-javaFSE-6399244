package PBM1;

import static org.junit.Assert.*;

public class AssertionsTest {


    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null, "Object should be null");

        // Assert not null
        assertNotNull(new Object());
    }
}

