package JUnit_Activites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Activity_2 {

	@Test
	void notEnoughFunds() {
	    // Create an object for BankAccount class
	    BankAccount account = new BankAccount(9);
	 
	    // Assertion for exception
	    assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10));
	}
	
	@Test
	void enoughFunds() {
	    // Create an object for BankAccount class
	    BankAccount account = new BankAccount(100);

	    // Assertion for no exceptions
	    assertDoesNotThrow(() -> account.withdraw(100));
	}
}
