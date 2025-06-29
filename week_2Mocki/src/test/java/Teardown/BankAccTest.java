package Teardown;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class BankAccTest {
	
 private BankAcc account;
	 
	 @Before
	    public void setUp() {
	        account = new BankAcc();
	        System.out.println("Account setup complete");
	    }

	    @After
	    public void tearDown() {
	        account.reset();
	        System.out.println("Account reset complete");
	    }

	@Test
	public void test() {
		 int depositAmount = 1000;
	        
	        account.deposit(depositAmount);
	        assertEquals(1000, account.getBalance());
	}
	
	 @Test
	    public void testWithdraw() {
	      
	        account.deposit(1000);
	        int withdrawAmount = 400;

	        account.withdraw(withdrawAmount);
	        assertEquals(600, account.getBalance());
	    }

	    @Test
	    public void testOverdraftNotAllowed() {
	        
	        account.deposit(200);
	        account.withdraw(500); 

	        assertEquals(200, account.getBalance()); 
	    }


}
