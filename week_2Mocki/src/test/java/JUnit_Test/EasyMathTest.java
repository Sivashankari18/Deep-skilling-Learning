package JUnit_Test;


import static org.junit.Assert.*;

import org.junit.Test;


public class EasyMathTest {
	
	@Test
	public void test() {
	
		 EasyMath math = new EasyMath();
	     assertEquals(7, math.add(3, 4));
	     assertEquals(0, math.add(-2, 2));
		
	}
	 @Test
	    public void testIsEven() {
	        EasyMath math = new EasyMath();
	        assertTrue(math.iseven(6)); 
	        assertFalse(math.iseven(9)); 
	    }

}
