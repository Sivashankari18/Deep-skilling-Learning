package Junit_Assertion;

import static org.junit.Assert.*;


import org.junit.Test;

public class AssertionTest {
	
	@Test
	public void testSquare() {
        Assertion mh = new Assertion();
        assertEquals(16, mh.square(4));         
    }

    @Test
    public void testIsPositive() {
        Assertion mh = new Assertion();
        assertTrue(mh.isPositive(10));          
        assertFalse(mh.isPositive(-5));         
    }

    @Test
    public void testNullAndNotNull() {
        Assertion mh = new Assertion();
        assertNull(mh.getNullValue());          
        assertNotNull(mh.getNonNullValue());    
    }

}
