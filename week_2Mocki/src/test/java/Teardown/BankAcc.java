package Teardown;

public class BankAcc {
	
	 private int balance;

	    public BankAcc() {
	        this.balance = 0;
	    }

	    public void deposit(int amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    public void withdraw(int amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	        }
	    }

	    public int getBalance() {
	        return balance;
	    }

	    public void reset() {
	        balance = 0;
	    }

}
